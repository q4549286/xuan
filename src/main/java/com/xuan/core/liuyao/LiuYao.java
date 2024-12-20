package com.xuan.core.liuyao;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 六爻
 *
 * @author 善待
 */
@Getter
public class LiuYao {

    /**
     * 姓名
     */
    private String name;
    /**
     * 性别（男。女）
     */
    private String sex;
    /**
     * 占事
     */
    private String occupy;
    /**
     * 地区
     */
    private String address;

    /**
     * 农历日期
     */
    private Lunar lunar;
    /**
     * 公历日期
     */
    private Solar solar;
    /**
     * 公历日期
     */
    private String solarStr;
    /**
     * 农历日期
     */
    private String lunarStr;
    /**
     * 星期
     */
    private String week;

    /**
     * 年干
     */
    private String yearGan;
    /**
     * 月干
     */
    private String monthGan;
    /**
     * 日干
     */
    private String dayGan;
    /**
     * 时干
     */
    private String hourGan;

    /**
     * 年支
     */
    private String yearZhi;
    /**
     * 月支
     */
    private String monthZhi;
    /**
     * 日支
     */
    private String dayZhi;
    /**
     * 时支
     */
    private String hourZhi;

    /**
     * 年干支
     */
    private String yearGanZhi;
    /**
     * 月干支
     */
    private String monthGanZhi;
    /**
     * 日干支
     */
    private String dayGanZhi;
    /**
     * 时干支
     */
    private String hourGanZhi;

    /**
     * 八字
     */
    private List<String> baZi;
    /**
     * 八字五行
     */
    private List<String> baZiWuXing;
    /**
     * 八字纳音
     */
    private List<String> baZiNaYin;
    /**
     * 八字旬空
     */
    private List<String> baZiXunKong;

    /**
     * 六爻爻象
     */
    private List<String> liuYaoAs;
    /**
     * 六爻爻象标识
     */
    private List<String> liuYaoYaoXiangMark;
    /**
     * 六爻爻象标识名称
     */
    private List<String> liuYaoYaoXiangMarkName;

    /**
     * 上卦
     */
    private String shangGua;
    /**
     * 上卦卦象
     */
    private String shangGuaAs;

    /**
     * 下卦
     */
    private String xiaGua;
    /**
     * 下卦卦象
     */
    private String xiaGuaAs;

    /**
     * 本卦
     */
    private String benGua;
    /**
     * 本卦卦象
     */
    private String benGuaAs;
    /**
     * 本卦类型
     */
    private String benGuaType;
    /**
     * 本卦卦身
     */
    private String benGuaGuaShen;
    /**
     * 本卦卦辞
     */
    private String benGuaGuaCi;
    /**
     * 本卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoName;
    /**
     * 本卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoAs;
    /**
     * 本卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoShiYing;
    /**
     * 本卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoLiuQin;
    /**
     * 本卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoGanZhi;
    /**
     * 本卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoWuXing;
    /**
     * 本卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoLiuShen;
    /**
     * 本卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoYaoCi;
    /**
     * 本卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoGanZhiNaYin;

    /**
     * 变卦
     */
    private String bianGua;
    /**
     * 变卦卦象
     */
    private String bianGuaAs;
    /**
     * 变卦类型
     */
    private String bianGuaType;
    /**
     * 变卦卦身
     */
    private String bianGuaGuaShen;
    /**
     * 变卦卦辞
     */
    private String bianGuaGuaCi;
    /**
     * 变卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoName;
    /**
     * 变卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoAs;
    /**
     * 变卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoShiYing;
    /**
     * 变卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoLiuQin;
    /**
     * 变卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoGanZhi;
    /**
     * 变卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoWuXing;
    /**
     * 变卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoLiuShen;
    /**
     * 变卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoYaoCi;
    /**
     * 变卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoGanZhiNaYin;

    /**
     * 互卦
     */
    private String huGua;
    /**
     * 互卦卦象
     */
    private String huGuaAs;
    /**
     * 互卦类型
     */
    private String huGuaType;
    /**
     * 互卦卦身
     */
    private String huGuaGuaShen;
    /**
     * 互卦卦辞
     */
    private String huGuaGuaCi;
    /**
     * 互卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoName;
    /**
     * 互卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoAs;
    /**
     * 互卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoShiYing;
    /**
     * 互卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoLiuQin;
    /**
     * 互卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoGanZhi;
    /**
     * 互卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoWuXing;
    /**
     * 互卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoLiuShen;
    /**
     * 互卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoYaoCi;
    /**
     * 互卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoGanZhiNaYin;

    /**
     * 错卦
     */
    private String cuoGua;
    /**
     * 错卦卦象
     */
    private String cuoGuaAs;
    /**
     * 错卦类型
     */
    private String cuoGuaType;
    /**
     * 错卦卦身
     */
    private String cuoGuaGuaShen;
    /**
     * 错卦卦辞
     */
    private String cuoGuaGuaCi;
    /**
     * 错卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoName;
    /**
     * 错卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoAs;
    /**
     * 错卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoShiYing;
    /**
     * 错卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoLiuQin;
    /**
     * 错卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoGanZhi;
    /**
     * 错卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoWuXing;
    /**
     * 错卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoLiuShen;
    /**
     * 错卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoYaoCi;
    /**
     * 错卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoGanZhiNaYin;

    /**
     * 综卦
     */
    private String zongGua;
    /**
     * 综卦卦象
     */
    private String zongGuaAs;
    /**
     * 综卦类型
     */
    private String zongGuaType;
    /**
     * 综卦卦身
     */
    private String zongGuaGuaShen;
    /**
     * 综卦卦辞
     */
    private String zongGuaGuaCi;
    /**
     * 综卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoName;
    /**
     * 综卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoAs;
    /**
     * 综卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoShiYing;
    /**
     * 综卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoLiuQin;
    /**
     * 综卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoGanZhi;
    /**
     * 综卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoWuXing;
    /**
     * 综卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoLiuShen;
    /**
     * 综卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoYaoCi;
    /**
     * 综卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoGanZhiNaYin;

    /**
     * 伏卦
     */
    private String fuGua;
    /**
     * 伏卦卦象
     */
    private String fuGuaAs;
    /**
     * 伏卦类型
     */
    private String fuGuaType;
    /**
     * 伏卦卦身
     */
    private String fuGuaGuaShen;
    /**
     * 伏卦卦辞
     */
    private String fuGuaGuaCi;
    /**
     * 伏卦的六爻爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoName;
    /**
     * 伏卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoAs;
    /**
     * 伏卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoShiYing;
    /**
     * 伏卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoLiuQin;
    /**
     * 伏卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoGanZhi;
    /**
     * 伏卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoWuXing;
    /**
     * 伏卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoLiuShen;
    /**
     * 伏卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoYaoCi;
    /**
     * 伏卦的六爻伏神（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoFuShen;
    /**
     * 伏卦的六爻干支纳音（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> fuGuaLiuYaoGanZhiNaYin;

    /**
     * 驿马
     */
    private String yiMa;
    /**
     * 天马
     */
    private String tianMa;
    /**
     * 天元禄
     */
    private String tianYuanLu;
    /**
     * 天乙贵人
     */
    private String tianYiGuiRen;
    /**
     * 太极贵人
     */
    private String taiJiGuiRen;
    /**
     * 天德贵人
     */
    private String tianDeGuiRen;
    /**
     * 月德贵人
     */
    private String yueDeGuiRen;
    /**
     * 唐符国印
     */
    private String tangFuGuoYin;
    /**
     * 咸池（桃花）
     */
    private String xianChi;
    /**
     * 天喜
     */
    private String tianXi;
    /**
     * 皇恩
     */
    private String huangEn;
    /**
     * 文昌
     */
    private String wenChang;
    /**
     * 华盖
     */
    private String huaGai;
    /**
     * 将星
     */
    private String jiangXing;
    /**
     * 灾煞
     */
    private String zaiSha;
    /**
     * 劫煞
     */
    private String jieSha;
    /**
     * 谋星
     */
    private String mouXing;
    /**
     * 天医
     */
    private String tianYi;

//************************************************************************************************************************************

    /**
     * 使用默认设置初始化（默认使用当前公历日期）
     */
    public LiuYao() {
        core(new LiuYaoSetting());
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public LiuYao(Date date) {
        core(new LiuYaoSetting(date));
    }

    /**
     * 使用日期、日期类型初始化
     *
     * @param date     日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYao(Date date, int dateType) {
        core(new LiuYaoSetting(date, dateType));
    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   公历年（0~9999）
     * @param month  公历月（1~12）
     * @param day    公历日（1~31）
     * @param hour   公历时（0~23）
     * @param minute 公历分（0~59）
     * @param second 公历秒（0~59）
     */
    public LiuYao(int year, int month, int day, int hour, int minute, int second) {
        core(new LiuYaoSetting(year, month, day, hour, minute, second));
    }

    /**
     * 使用年月日时分秒、日期类型初始化
     *
     * @param year     年
     * @param month    月
     * @param day      日
     * @param hour     时
     * @param minute   分
     * @param second   秒
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYao(int year, int month, int day, int hour, int dateType, int minute, int second) {
        core(new LiuYaoSetting(year, month, day, hour, minute, second, dateType));
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 设置
     */
    public LiuYao(LiuYaoSetting setting) {
        core(setting);
    }

//====================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 六爻-设置
     */
    private void core(LiuYaoSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZi(); // 计算八字
        baZiWuXing(); // 计算八字五行
        baZiNaYin(); // 计算八字纳音
        baZiXunKong(); // 计算八字旬空
        shangGua(); // 计算上卦的卦名、卦象
        xiaGua(); // 计算下卦的卦名、卦象
        benGua(); // 计算本卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
        bianGua(); // 计算变卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
        huGua(); // 计算互卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
        cuoGua(); // 计算错卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
        zongGua(); // 计算综卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
        fuGua(); // 计算伏卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞、六爻伏神
        yiMa(); // 计算驿马
        tianMa(); // 计算天马
        tianYuanLu(); // 计算天元禄
        tianYiGuiRen(); // 计算天乙贵人
        taiJiGuiRen(); // 计算太极贵人
        tianDeGuiRen(); // 计算天德贵人
        yueDeGuiRen(); // 计算月德贵人
        tangFuGuoYin(); // 计算唐符国印
        xianChi(); // 计算咸池（桃花）
        tianXi(); // 计算天喜
        huangEn(); // 计算皇恩
        wenChang(); // 计算文昌
        huaGai(); // 计算华盖
        jiangXing(); // 计算将星
        zaiSha(); // 计算灾煞
        jieSha(); // 计算劫煞
        mouXing(); // 计算谋星
        tianYi(); // 计算天医

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 六爻-设置
     */
    private void initialize(LiuYaoSetting setting) {

        // 1、设置基础信息
        this.name = setting.getName();
        this.sex = setting.getSex() == 0 ? "女" : "男";
        this.occupy = setting.getOccupy();
        this.address = setting.getAddress();

        // 2.1、判断日期类型并返回公历日期、农历日期
        Map<String, Object> DateTypeMap = LiuYaoUtil.isDateType(setting);
        // 2.2、设置日期
        this.solar = (Solar) DateTypeMap.get("solar"); // 公历日期
        this.lunar = (Lunar) DateTypeMap.get("lunar"); // 农历日期
        this.solarStr = CommonUtil.solarStr(getSolar()); // 公历日期
        this.lunarStr = CommonUtil.lunarStr(getLunar()); // 农历日期

        // 3、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 4.1、判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = LiuYaoUtil.isGanZhi(setting, getSolar().getLunar());
        // 4.2、设置年干支
        List<String> yearGanZhi = ganZhiMap.get("yearGanZhi");
        this.yearGan = yearGanZhi.get(0); // 年干
        this.yearZhi = yearGanZhi.get(1); // 年支
        this.yearGanZhi = yearGanZhi.get(2); // 年干支
        // 4.3、设置月干支
        List<String> monthGanZhi = ganZhiMap.get("monthGanZhi");
        this.monthGan = monthGanZhi.get(0); // 月干
        this.monthZhi = monthGanZhi.get(1); // 月支
        this.monthGanZhi = monthGanZhi.get(2); // 月干支
        // 4.4、设置日干支
        List<String> dayGanZhi = ganZhiMap.get("dayGanZhi");
        this.dayGan = dayGanZhi.get(0); // 日干
        this.dayZhi = dayGanZhi.get(1); // 日支
        this.dayGanZhi = dayGanZhi.get(2); // 日干支
        // 4.5、设置时干支
        List<String> hourGanZhi = ganZhiMap.get("hourGanZhi");
        this.hourGan = hourGanZhi.get(0); // 时干
        this.hourZhi = hourGanZhi.get(1); // 时支
        this.hourGanZhi = hourGanZhi.get(2); // 时干支

        // 5、☆判断起卦模式
        if (setting.getQiGuaMode() == 0) {
            // 5.1、日期起卦模式
            dateQiGua(); // 计算六爻爻象、六爻爻象标识、六爻爻象标识名称
        } else {
            // 5.2、其他起卦模式
            List<List<String>> list = LiuYaoUtil.isQiGuaMode(setting);
            if (null != list && list.size() == 3) {
                this.liuYaoAs = list.get(0); // 六爻爻象
                this.liuYaoYaoXiangMark = list.get(1); // 六爻爻象标识
                this.liuYaoYaoXiangMarkName = list.get(2); // 六爻爻象标识名称
            }
        }

    }

    /**
     * 计算八字
     */
    private void baZi() {

        this.baZi = Arrays.asList(getYearGanZhi(), getMonthGanZhi(), getDayGanZhi(), getHourGanZhi()); // 八字

    }

    /**
     * 计算八字五行
     */
    private void baZiWuXing() {

        Map<String, String> ganMap = LiuYaoMap.GAN_WU_XING; // 天干五行（天干为键）
        Map<String, String> zhiMap = LiuYaoMap.ZHI_WU_XING; // 地支五行（地支为键）

        String yearGanZhiWuXing = ganMap.get(getYearGan()) + zhiMap.get(getYearZhi());    // 年干支五行
        String monthGanZhiWuXing = ganMap.get(getMonthGan()) + zhiMap.get(getMonthZhi()); // 月干支五行
        String dayGanZhiWuXing = ganMap.get(getDayGan()) + zhiMap.get(getDayZhi());       // 日干支五行
        String hourGanZhiWuXing = ganMap.get(getHourGan()) + zhiMap.get(getHourZhi());    // 时干支五行

        this.baZiWuXing = Arrays.asList(yearGanZhiWuXing, monthGanZhiWuXing, dayGanZhiWuXing, hourGanZhiWuXing);

    }

    /**
     * 计算八字纳音
     */
    private void baZiNaYin() {

        Map<String, String> naYin = LiuYaoMap.NA_YIN; // 纳音（干支为键）

        String yearGanZhiNaYin = naYin.get(getYearGanZhi());   // 年干支纳音
        String monthGanZhiNaYin = naYin.get(getMonthGanZhi()); // 月干支纳音
        String dayGanZhiNaYin = naYin.get(getDayGanZhi());     // 日干支纳音
        String hourGanZhiNaYin = naYin.get(getHourGanZhi());   // 时干支纳音

        this.baZiNaYin = Arrays.asList(yearGanZhiNaYin, monthGanZhiNaYin, dayGanZhiNaYin, hourGanZhiNaYin);

    }

    /**
     * 计算八字旬空
     */
    private void baZiXunKong() {

        Map<String, String> kongWang = LiuYaoMap.KONG_WANG; // 空亡（干支为键）

        String yearGanZhiXunKong = kongWang.get(getYearGanZhi()); // 年干支旬空
        String monthGanZhiXunKong = kongWang.get(getMonthGanZhi()); // 月干支旬空
        String dayGanZhiXunKong = kongWang.get(getDayGanZhi()); // 日干支旬空
        String hourGanZhiXunKong = kongWang.get(getHourGanZhi()); // 时干支旬空

        this.baZiXunKong = Arrays.asList(yearGanZhiXunKong, monthGanZhiXunKong, dayGanZhiXunKong, hourGanZhiXunKong);

    }

    /**
     * 计算六爻爻象、六爻爻象标识、六爻爻象标识名称（日期起卦模式）
     */
    private void dateQiGua() {

        /*
            计算方法（以农历计算）↓

                 上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
                 下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
                 动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
         */

        Map<String, Integer> diZhiShu = LiuYaoMap.DI_ZHI_SHU; // 地支对应的数字

        int yearNumber = diZhiShu.get(getYearZhi());  // 年数
        int monthNumber = getLunar().getMonth(); // 月数
        int dayNumber = getLunar().getDay(); // 日数
        int hourNumber = diZhiShu.get(getHourZhi()); // 时数

        // 1、计算上卦数：（年数+月数+日数）÷8得出余数，若除尽则统一用8表示
        int shangGuaNumber = (yearNumber + monthNumber + dayNumber) % 8;
        shangGuaNumber = shangGuaNumber == 0 ? 8 : shangGuaNumber;

        // 2、计算下卦数：（年数+月数+日数+时数）÷8得出余数，若除尽则统一用8表示
        int xiaGuaNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 8;
        xiaGuaNumber = xiaGuaNumber == 0 ? 8 : xiaGuaNumber;

        // 3、计算动爻数：（年数+月数+日数+时数）÷6得出余数，若除尽则统一用6表示
        int dongYaoNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 6;
        dongYaoNumber = dongYaoNumber == 0 ? 6 : dongYaoNumber;

        Map<List<Integer>, String> liuShiSiGuaAs = LiuYaoMap.LIU_SHI_SI_GUA_AS; // 六十四卦卦象
        Map<String, List<String>> liuYaoYaoXiang = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS; // 六十四卦的六爻爻象
        // 4.1、根据上卦数和下卦数获取本卦卦象
        String benGuaAs = liuShiSiGuaAs.get(Arrays.asList(shangGuaNumber, xiaGuaNumber));
        // 4.2、根据本卦卦象获取六爻爻象
        List<String> liuYaoYaoXiangList = liuYaoYaoXiang.get(benGuaAs);

        // 5、根据动爻数计算六爻标识
        List<String> liuYaoMarkList = CommonUtil.addCharToList(6);
        if ("—".equals(liuYaoYaoXiangList.get(dongYaoNumber - 1))) {
            liuYaoMarkList.set(dongYaoNumber - 1, "○"); // 该爻为阳爻，则在该爻位上添加标识：○
        } else {
            liuYaoMarkList.set(dongYaoNumber - 1, "×"); // 该爻为阴爻，则在该爻位上添加标识：×
        }

        // 6、计算六爻爻象标识名称
        List<String> liuYaoMarkNameList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if ("—".equals(liuYaoYaoXiangList.get(i)) && "".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("少阳");
            }
            if ("--".equals(liuYaoYaoXiangList.get(i)) && "".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("少阴");
            }
            if ("—".equals(liuYaoYaoXiangList.get(i)) && "○".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("老阳");
            }
            if ("--".equals(liuYaoYaoXiangList.get(i)) && "×".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("老阴");
            }
        }

        this.liuYaoAs = liuYaoYaoXiangList; // 六爻爻象
        this.liuYaoYaoXiangMark = liuYaoMarkList; // 六爻爻象标识
        this.liuYaoYaoXiangMarkName = liuYaoMarkNameList; // 六爻爻象标识名称

    }

    /**
     * 计算上卦的卦名、卦象
     */
    private void shangGua() {

        // 1、通过[六爻爻象]获取：上卦卦名、上卦卦象
        Map<List<String>, List<String>> map = LiuYaoMap.NAME_AND_AS;

        // 2、设置上卦的卦名、卦象
        this.shangGua = map.get(getLiuYaoAs()).get(0); // 上卦卦名
        this.shangGuaAs = map.get(getLiuYaoAs()).get(1); // 上卦卦象

    }

    /**
     * 计算下卦的卦名、卦象
     */
    private void xiaGua() {

        // 1、通过[六爻爻象]获取：下卦卦名、下卦卦象
        Map<List<String>, List<String>> map = LiuYaoMap.NAME_AND_AS;

        // 2、设置下卦的卦名、卦象
        this.xiaGua = map.get(getLiuYaoAs()).get(2); // 下卦卦名
        this.xiaGuaAs = map.get(getLiuYaoAs()).get(3); // 下卦卦象

    }

    /**
     * 计算本卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
     */
    private void benGua() {

        // 设置数据
        this.benGua = LiuYaoMap.NAME_AND_AS.get(getLiuYaoAs()).get(4); // 卦名
        this.benGuaAs = LiuYaoMap.NAME_AND_AS.get(getLiuYaoAs()).get(5); // 卦象
        this.benGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBenGua()).get(0); // 类型
        this.benGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBenGua()).get(1); // 卦身
        this.benGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBenGua()).get(2); // 卦辞
        this.benGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBenGuaAs()); // 六爻爻名
        this.benGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getBenGuaAs()); // 六爻爻象
        this.benGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getBenGuaAs()); // 六爻世应
        this.benGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getBenGuaAs()); // 六爻六亲
        this.benGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getBenGuaAs()); // 六爻干支
        this.benGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getBenGuaAs()); // 六爻干支纳音
        this.benGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getBenGuaAs()); // 六爻五行
        this.benGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.benGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBenGuaAs()); // 六爻爻辞

    }

    /**
     * 计算变卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
     */
    private void bianGua() {

        // 1、根据六爻爻象标识判断是否存在变爻，即 × 或 ○
        List<String> liuYaoAs = new ArrayList<>(); // 保存六爻爻象
        for (int i = 0; i < getLiuYaoYaoXiangMark().size(); i++) {
            // 根据六爻爻象标识判断阴阳爻
            if (!"".equals(getLiuYaoYaoXiangMark().get(i))) {
                liuYaoAs.add("—".equals(getLiuYaoAs().get(i)) ? "--" : "—"); // 阳爻变阴爻，阴爻变阳爻
            } else {
                liuYaoAs.add(getLiuYaoAs().get(i));
            }
        }

        // 2、设置数据
        this.bianGua = LiuYaoMap.NAME_AND_AS.get(liuYaoAs).get(4); // 卦名
        this.bianGuaAs = LiuYaoMap.NAME_AND_AS.get(liuYaoAs).get(5); // 卦象
        this.bianGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBianGua()).get(0); // 类型
        this.bianGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBianGua()).get(1); // 卦身
        this.bianGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getBianGua()).get(2); // 卦辞
        this.bianGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBianGuaAs()); // 六爻爻名
        this.bianGuaLiuYaoAs = liuYaoAs; // 变卦的六爻爻象
//        this.benGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getBianGuaAs()); // 六爻爻象
        this.bianGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getBianGuaAs()); //六爻 世应
        this.bianGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getBianGuaAs()); // 六爻六亲
        this.bianGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getBianGuaAs()); // 六爻干支
        this.bianGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getBianGuaAs()); // 六爻干支纳音
        this.bianGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getBianGuaAs()); // 六爻五行
        this.bianGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.bianGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBianGuaAs()); // 六爻爻辞

    }

    /**
     * 计算互卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
     */
    private void huGua() {

        // 设置数据
        this.huGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(0); // 卦象
        this.huGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getHuGuaAs()); // 卦名
        this.huGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getHuGua()).get(0); // 类型
        this.huGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getHuGua()).get(1); // 卦身
        this.huGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getHuGua()).get(2); // 卦辞
        this.huGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getHuGuaAs()); // 六爻爻名
        this.huGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getHuGuaAs()); // 六爻爻象
        this.huGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getHuGuaAs()); // 六爻世应
        this.huGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getHuGuaAs()); // 六爻六亲
        this.huGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getHuGuaAs()); // 六爻干支
        this.huGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getHuGuaAs()); // 六爻干支纳音
        this.huGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getHuGuaAs()); // 六爻五行
        this.huGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.huGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getHuGuaAs()); // 六爻爻辞

    }

    /**
     * 计算错卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
     */
    private void cuoGua() {

        // 设置数据
        this.cuoGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(1); // 卦象
        this.cuoGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getCuoGuaAs()); // 卦名
        this.cuoGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getCuoGua()).get(0); // 类型
        this.cuoGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getCuoGua()).get(1); // 卦身
        this.cuoGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getCuoGua()).get(2); // 卦辞
        this.cuoGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getCuoGuaAs()); // 六爻爻名
        this.cuoGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getCuoGuaAs()); // 六爻爻象
        this.cuoGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getCuoGuaAs()); // 六爻世应
        this.cuoGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getCuoGuaAs()); // 六爻六亲
        this.cuoGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getCuoGuaAs()); // 六爻干支
        this.cuoGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getCuoGuaAs()); // 六爻干支纳音
        this.cuoGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getCuoGuaAs()); // 六爻五行
        this.cuoGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.cuoGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getCuoGuaAs()); // 六爻爻辞

    }

    /**
     * 计算综卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞
     */
    private void zongGua() {

        // 设置数据
        this.zongGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(2); // 卦象
        this.zongGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getZongGuaAs()); // 卦名
        this.zongGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getZongGua()).get(0); // 类型
        this.zongGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getZongGua()).get(1); // 卦身
        this.zongGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getZongGua()).get(2); // 卦辞
        this.zongGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getZongGuaAs()); // 六爻爻名
        this.zongGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getZongGuaAs()); // 六爻爻象
        this.zongGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getZongGuaAs()); // 六爻世应
        this.zongGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getZongGuaAs()); // 六爻六亲
        this.zongGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getZongGuaAs()); // 六爻干支
        this.zongGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getZongGuaAs()); // 六爻干支纳音
        this.zongGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getZongGuaAs()); // 六爻五行
        this.zongGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.zongGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getZongGuaAs()); // 六爻爻辞

    }

    /**
     * 计算伏卦的卦名、卦象、类型、卦身、卦辞、六爻爻名、六爻爻象、六爻世应、六爻六亲、六爻干支、六爻干支纳音、六爻五行、六爻六神、六爻爻辞、六爻伏神
     */
    private void fuGua() {

        // 1、设置数据
        this.fuGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(3); // 卦象
        this.fuGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getFuGuaAs()); // 卦名
        this.fuGuaType = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getFuGua()).get(0); // 类型
        this.fuGuaGuaShen = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getFuGua()).get(1); // 卦身
        this.fuGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_SHEN_CI.get(getFuGua()).get(2); // 卦辞
        this.fuGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getFuGuaAs()); // 六爻爻名
        this.fuGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getFuGuaAs()); // 六爻爻象
        this.fuGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getFuGuaAs()); // 六爻世应
        this.fuGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getFuGuaAs()); // 六爻六亲
        this.fuGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getFuGuaAs()); // 六爻干支
        this.fuGuaLiuYaoGanZhiNaYin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI_NA_YIN.get(getFuGuaAs()); // 六爻干支纳音
        this.fuGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getFuGuaAs()); // 六爻五行
        this.fuGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六爻六神
        this.fuGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getFuGuaAs()); // 六爻爻辞

        // 2、计算六爻伏神
        List<String> fuGuaLiuYaoFuShen = CommonUtil.addCharToList(6);
        List<String> liuQinQueShi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_QIN_QUE_SHI.get(getBenGua()); // 本卦缺失的六亲（最多缺失两个）
        if (null != liuQinQueShi) {
            if (liuQinQueShi.size() == 1) {
                // 缺失一个六亲
                for (int i = 0; i < 6; i++) {
                    if (getFuGuaLiuYaoLiuQin().get(i).equals(liuQinQueShi.get(0))) {
                        fuGuaLiuYaoFuShen.set(i, "伏神");
                    }
                }
            } else {
                // 缺失两个六亲
                for (int i = 0; i < 6; i++) {
                    if (getFuGuaLiuYaoLiuQin().get(i).equals(liuQinQueShi.get(0))) {
                        fuGuaLiuYaoFuShen.set(i, "伏神");
                    }
                    if (getFuGuaLiuYaoLiuQin().get(i).equals(liuQinQueShi.get(1))) {
                        fuGuaLiuYaoFuShen.set(i, "伏神");
                    }
                }
            }
        }

        this.fuGuaLiuYaoFuShen = fuGuaLiuYaoFuShen;

    }

    /**
     * 计算驿马
     */
    private void yiMa() {

        this.yiMa = LiuYaoMap.YI_MA.get(getHourZhi());

    }

    /**
     * 计算天马
     */
    private void tianMa() {

        this.tianMa = LiuYaoMap.TIAN_MA.get(getMonthZhi());

    }

    /**
     * 计算天元禄
     */
    private void tianYuanLu() {

        this.tianYuanLu = LiuYaoMap.TIAN_YUAN_LU.get(getDayGan());

    }

    /**
     * 计算天乙贵人
     */
    private void tianYiGuiRen() {

        this.tianYiGuiRen = LiuYaoMap.TIAN_YI_GUI_REN.get(getDayGan());

    }

    /**
     * 计算太极贵人
     */
    private void taiJiGuiRen() {

        List<String> yearZhi = LiuYaoMap.TAI_JI_GUI_REN.get(getYearGan()); // 根据年干获取太极贵人所要落入的地支
        List<String> dayZhi = LiuYaoMap.TAI_JI_GUI_REN.get(getDayGan()); // 根据日干获取太极贵人所要落入的地支
        this.taiJiGuiRen = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算天德贵人
     */
    private void tianDeGuiRen() {

        this.tianDeGuiRen = LiuYaoMap.TIAN_DE_GUI_REN.get(getMonthZhi());

    }

    /**
     * 计算月德贵人
     */
    private void yueDeGuiRen() {

        this.yueDeGuiRen = LiuYaoMap.YUE_DE_GUI_REN.get(getMonthZhi());

    }

    /**
     * 计算唐符国印
     */
    private void tangFuGuoYin() {

        this.tangFuGuoYin = LiuYaoMap.TANG_FU_GUO_YIN.get(getYearZhi());

    }

    /**
     * 计算咸池（桃花）
     */
    private void xianChi() {

        this.xianChi = LiuYaoMap.XIAN_CHI.get(getDayZhi());

    }

    /**
     * 计算天喜
     */
    private void tianXi() {

        this.tianXi = LiuYaoMap.TIAN_XI.get(getMonthZhi());

    }

    /**
     * 计算皇恩
     */
    private void huangEn() {

        this.huangEn = LiuYaoMap.HUANG_EN.get(getMonthZhi());

    }

    /**
     * 计算文昌
     */
    private void wenChang() {

        this.wenChang = LiuYaoMap.WEN_CHANG.get(getDayGan());

    }

    /**
     * 计算华盖
     */
    private void huaGai() {

        List<String> yearZhi = LiuYaoMap.HUA_GAI.get(getYearZhi()); // 根据年干获取华盖所要落入的地支
        List<String> dayZhi = LiuYaoMap.HUA_GAI.get(getDayZhi()); // 根据日干获取华盖所要落入的地支
        this.huaGai = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算将星
     */
    private void jiangXing() {

        List<String> yearZhi = LiuYaoMap.JIANG_XING.get(getYearZhi()); // 根据年干获取将星所要落入的地支
        List<String> dayZhi = LiuYaoMap.JIANG_XING.get(getDayZhi()); // 根据日干获取将星所要落入的地支
        this.jiangXing = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算灾煞
     */
    private void zaiSha() {

        this.zaiSha = LiuYaoMap.ZAI_SHA.get(getDayZhi());

    }

    /**
     * 计算劫煞
     */
    private void jieSha() {

        this.jieSha = LiuYaoMap.JIE_SHA.get(getDayZhi());

    }

    /**
     * 计算谋星
     */
    private void mouXing() {

        this.mouXing = LiuYaoMap.MOU_XING.get(getDayZhi());

    }

    /**
     * 计算天医
     */
    private void tianYi() {

        this.tianYi = LiuYaoMap.TIAN_YI.get(getMonthZhi());

    }

//------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 返回神煞
     *
     * @param yearZhi 年干地支
     * @param dayZhi  日干地支
     */
    private String returnShenSha(List<String> yearZhi, List<String> dayZhi) {

        // 1、判断年支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getYearZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getYearZhi().equals(key)) return key;
        }
        // 2、判断月支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getMonthZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getMonthZhi().equals(key)) return key;
        }
        // 3、判断日支，若匹配返回神煞
        for (String key : yearZhi) {
            if (getDayZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getDayZhi().equals(key)) return key;
        }
        // 4、判断时支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getHourZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getHourZhi().equals(key)) return key;
        }

        return null;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("公历:").append(getSolarStr());
        sb.append("   ");
        sb.append("农历:").append(getLunarStr());
        sb.append("   ");
        sb.append("星期:").append(getWeek());
        sb.append("   ");
        sb.append("八字:").append(getBaZi());
        sb.append("   ");
        sb.append("八字五行:").append(getBaZiWuXing());
        sb.append("   ");
        sb.append("八字纳音:").append(getBaZiNaYin());
        sb.append("   ");
        sb.append("上卦:").append(getShangGua()).append("(").append(getShangGuaAs()).append(")");
        sb.append("   ");
        sb.append("下卦:").append(getXiaGua()).append("(").append(getXiaGuaAs()).append(")");
        sb.append("   ");
        sb.append("本卦:").append(getBenGua()).append("(").append(getBenGuaAs()).append(")");
        sb.append("   ");
        sb.append("变卦:").append(getBianGua()).append("(").append(getBianGuaAs()).append(")");
        sb.append("   ");
        sb.append("互卦:").append(getHuGua()).append("(").append(getHuGuaAs()).append(")");
        sb.append("   ");
        sb.append("错卦:").append(getCuoGua()).append("(").append(getCuoGuaAs()).append(")");
        sb.append("   ");
        sb.append("综卦:").append(getZongGua()).append("(").append(getZongGuaAs()).append(")");
        sb.append("   ");
        sb.append("伏卦:").append(getFuGua()).append("(").append(getFuGuaAs()).append(")");
        sb.append("   ");
        sb.append("驿马:").append(getYiMa());
        sb.append("   ");
        sb.append("天马:").append(getTianMa());
        sb.append("   ");
        sb.append("天元禄:").append(getTianYuanLu());
        sb.append("   ");
        sb.append("天乙贵人:").append(getTianYiGuiRen());
        sb.append("   ");
        sb.append("太极贵人:").append(getTaiJiGuiRen());
        sb.append("   ");
        sb.append("天德贵人:").append(getTianDeGuiRen());
        sb.append("   ");
        sb.append("月德贵人:").append(getYueDeGuiRen());
        sb.append("   ");
        sb.append("符印:").append(getTangFuGuoYin());
        sb.append("   ");
        sb.append("咸池:").append(getXianChi());
        sb.append("   ");
        sb.append("天喜:").append(getTianXi());
        sb.append("   ");
        sb.append("皇恩:").append(getHuangEn());
        sb.append("   ");
        sb.append("文昌:").append(getWenChang());
        sb.append("   ");
        sb.append("华盖:").append(getHuaGai());
        sb.append("   ");
        sb.append("将星:").append(getJiangXing());
        sb.append("   ");
        sb.append("灾煞:").append(getZaiSha());
        sb.append("   ");
        sb.append("劫煞:").append(getJieSha());
        sb.append("   ");
        sb.append("谋星:").append(getMouXing());
        sb.append("   ");
        sb.append("天医:").append(getTianYi());

        return sb.toString();

    }


}
