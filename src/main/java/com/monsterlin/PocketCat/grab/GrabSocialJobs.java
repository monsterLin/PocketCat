package com.monsterlin.PocketCat.grab;

import com.monsterlin.PocketCat.constant.PartTimeJobSite;
import com.monsterlin.PocketCat.domain.PcSocialJob;
import com.monsterlin.PocketCat.utils.TimeUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 抓取百度兼职
 * @date : 2017/12/4
 */
public class GrabSocialJobs {

    /**
     * 解析top20的兼职数据
     *
     * @return
     */
    public static List<PcSocialJob> grabTopPartJobs() {
        Document doc;

        List<PcSocialJob> pcSocialJobList = new ArrayList<>();

        List<String> titleList = new ArrayList<>();
        List<String> placeList = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> sourceList = new ArrayList<>();
        List<String> detailUrlList = new ArrayList<>();

        int isBlack = 1;

        try {
            doc = Jsoup.connect(PartTimeJobSite.JIANZHIMAO).get();

            /**
             * 解析标题
             * eg: 服务员便利蜂补货员（济南蜂房）
             */
            Elements titleElements = doc.select(".title-h3");

            for (int i = 0; i < titleElements.size(); i++) {
                titleList.add(titleElements.get(i).text());
            }

            /**
             * 解析地点和时间
             * eg: 济南济南 南京闲侠信息科技有限公司
             * eg: 昨天发布 | 有效期:2017-12-12~2018-03-11
             */
            Elements infoElements = doc.select(".left>p");

            for (int i = 0; i < infoElements.size(); i++) {
                if (i % 2 == 0) {
                    //地区信息
                    placeList.add(infoElements.get(i).text());
                } else {
                    //时间信息
                    timeList.add(infoElements.get(i).text());
                }
            }

            /**
             * 解析价格
             * eg: 60元/1.5小时左右
             */
            Elements priceElements = doc.select(".salary");

            for (int i = 0; i < priceElements.size(); i++) {
                priceList.add(priceElements.get(i).text());
            }

            /**
             * 解析来源
             * eg: 蚂蚁兼职
             */
            Elements sourceElements = doc.select(".right");

            for (int i = 0; i < sourceElements.size() - 1; i++) {
                String initialSource = sourceElements.get(i).text();
                int length = initialSource.length();
                String source = initialSource.substring(length - 4, length);
                sourceList.add(source);
            }

            /**
             * 解析对应的链接
             */
            Elements detailUrlElements = doc.select(".clearfix");

            // TODO: 2018/2/26  java.lang.IndexOutOfBoundsException: Index: 20, Size: 20
            int fromMax = 21;
            String baseHrefUrl = "http://zhaopin.baidu.com/";
            for (int i = 1; i < fromMax; i++) {
                detailUrlList.add(baseHrefUrl + detailUrlElements.get(i).attr("href"));
            }


            /**
             * 正式封装数据源
             */
            int max = 19;
            for (int i = 0; i <= max; i++) {
                String title = titleList.get(i);
                String place = placeList.get(i);
                String time = timeList.get(i);
                String price = priceList.get(i);
                String source = sourceList.get(i);
                String detailUrl = detailUrlList.get(i);
                long nowTimeStamp = TimeUtil.getNowTimeStamp();

                pcSocialJobList.add(new PcSocialJob(title, place, time, price, source, detailUrl, isBlack, nowTimeStamp));

            }


            return pcSocialJobList;


        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }


}
