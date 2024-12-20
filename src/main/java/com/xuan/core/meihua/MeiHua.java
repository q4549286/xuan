package com.xuan.core.meihua;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 梅花易数
 *
 * @author 善待
 */
@Getter
public class MeiHua {

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
     * 八字旬空
     */
    private List<String> baZiXunKong;
    /**
     * 八字纳音
     */
    private List<String> baZiNaYin;

    /**
     * 上卦数
     */
    private int shangGuaNumber;
    /**
     * 下卦数
     */
    private int xiaGuaNumber;
    /**
     * 动爻数
     */
    private int dongYaoNumber;

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
     * 动爻
     */
    private String dongYao;

    /**
     * 本卦
     */
    private String benGua;
    /**
     * 本卦卦象
     */
    private String benGuaAs;
    /**
     * 本卦的上卦
     */
    private String benGuaShangGua;
    /**
     * 本卦的上卦卦象
     */
    private String benGuaShangGuaAs;
    /**
     * 本卦的下卦
     */
    private String benGuaXiaGua;
    /**
     * 本卦的下卦卦象
     */
    private String benGuaXiaGuaAs;
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
     * 本卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoYaoCi;
    /**
     * 本卦的用卦与体卦关系
     */
    private String benYongTiLink;

    /**
     * 变卦
     */
    private String bianGua;
    /**
     * 变卦卦象
     */
    private String bianGuaAs;
    /**
     * 变卦的上卦
     */
    private String bianGuaShangGua;
    /**
     * 变卦的上卦卦象
     */
    private String bianGuaShangGuaAs;
    /**
     * 变卦的下卦
     */
    private String bianGuaXiaGua;
    /**
     * 变卦的下卦卦象
     */
    private String bianGuaXiaGuaAs;
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
     * 变卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoYaoCi;
    /**
     * 变卦的用卦与体卦关系
     */
    private String bianYongTiLink;

    /**
     * 互卦
     */
    private String huGua;
    /**
     * 互卦卦象
     */
    private String huGuaAs;
    /**
     * 互卦的上卦
     */
    private String huGuaShangGua;
    /**
     * 互卦的上卦卦象
     */
    private String huGuaShangGuaAs;
    /**
     * 互卦的下卦
     */
    private String huGuaXiaGua;
    /**
     * 互卦的下卦卦象
     */
    private String huGuaXiaGuaAs;
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
     * 互卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoYaoCi;
    /**
     * 互卦的用卦与体卦关系
     */
    private String huYongTiLink;

    /**
     * 错卦
     */
    private String cuoGua;
    /**
     * 错卦卦象
     */
    private String cuoGuaAs;
    /**
     * 错卦的上卦
     */
    private String cuoGuaShangGua;
    /**
     * 错卦的上卦卦象
     */
    private String cuoGuaShangGuaAs;
    /**
     * 错卦的下卦
     */
    private String cuoGuaXiaGua;
    /**
     * 错卦的下卦卦象
     */
    private String cuoGuaXiaGuaAs;
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
     * 错卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoYaoCi;
    /**
     * 错卦的用卦与体卦关系
     */
    private String cuoYongTiLink;

    /**
     * 综卦
     */
    private String zongGua;
    /**
     * 综卦卦象
     */
    private String zongGuaAs;
    /**
     * 综卦的上卦
     */
    private String zongGuaShangGua;
    /**
     * 综卦的上卦卦象
     */
    private String zongGuaShangGuaAs;
    /**
     * 综卦的下卦
     */
    private String zongGuaXiaGua;
    /**
     * 综卦的下卦卦象
     */
    private String zongGuaXiaGuaAs;
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
     * 综卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoYaoCi;
    /**
     * 综卦的用卦与体卦关系
     */
    private String zongYongTiLink;

    /**
     * 卦码
     */
    private String guaMa;

    /**
     * 上卦是否为用卦（true:用卦。false:体卦）
     */
    private Boolean shangGuaYong;
    /**
     * 下卦是否为用卦（true:用卦。false:体卦）
     */
    private Boolean xiaGuaYong;

//************************************************************************************************************************************

    /**
     * 使用默认设置初始化（默认使用当前公历日期）
     */
    public MeiHua() {
        core(new MeiHuaSetting());
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public MeiHua(Date date) {
        core(new MeiHuaSetting(date));
    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public MeiHua(Date date, int dateType) {
        core(new MeiHuaSetting(date, dateType));
    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   公历年（0~9999）
     * @param month  公历月（1~12）
     * @param day    公历日
     * @param hour   公历时（0~24）
     * @param minute 公历分（0~24）
     * @param second 公历秒（0~24）
     */
    public MeiHua(int year, int month, int day, int hour, int minute, int second) {
        core(new MeiHuaSetting(year, month, day, hour, minute, second));
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
    public MeiHua(int year, int month, int day, int hour, int dateType, int minute, int second) {
        core(new MeiHuaSetting(year, month, day, hour, minute, second, dateType));
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 梅花易数-设置
     */
    public MeiHua(MeiHuaSetting setting) {
        core(setting);
    }

//====================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 梅花易数-设置
     */
    private void core(MeiHuaSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZi(); // 计算八字
        baZiWuXing(); // 计算八字五行
        baZiNaYin(); // 计算八字纳音
        baZiXunKong(); // 计算八字旬空
        shangGua(); // 计算上卦及卦象
        xiaGua(); // 计算下卦及卦象
        isYongTi(); // 判断用卦、体卦
        dongYao(); // 计算动爻
        benGua(); // 计算本卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
        bianGua(); // 计算变卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
        huGua(); // 计算互卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
        cuoGua(); // 计算错卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
        zongGua(); // 计算综卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
        guaMa(); // 计算卦码

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 梅花易数-设置
     */
    private void initialize(MeiHuaSetting setting) {

        // 1、设置基础信息
        this.name = setting.getName();
        this.sex = setting.getSex() == 0 ? "女" : "男";
        this.occupy = setting.getOccupy();
        this.address = setting.getAddress();

        // 2.1、☆判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = MeiHuaUtil.isDateType(setting);
        // 2.2、设置日期
        this.solar = (Solar) dateMap.get("solar"); // 公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 农历日期
        this.solarStr = CommonUtil.solarStr(getSolar()); // 公历日期
        this.lunarStr = CommonUtil.lunarStr(getLunar()); // 农历日期

        // 3、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 4.1、☆判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = MeiHuaUtil.isGanZhi(setting, getSolar().getLunar());
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
            shangXiaGuaNumber(); // 计算上卦数，下卦数，动爻数
        } else {
            // 5.2、其他起卦模式
            List<Integer> number = MeiHuaUtil.isQiGuaMode(setting);
            this.shangGuaNumber = number.get(0); // 设置上卦数
            this.xiaGuaNumber = number.get(1); // 设置下卦数
            this.dongYaoNumber = number.get(2); // 设置动爻数
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

        Map<String, String> ganMap = MeiHuaMap.GAN_WU_XING; // 天干五行（天干为键）
        Map<String, String> zhiMap = MeiHuaMap.ZHI_WU_XING; // 地支五行（地支为键）

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

        Map<String, String> naYin = MeiHuaMap.NA_YIN; // 纳音（干支为键）

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

        Map<String, String> kongWang = MeiHuaMap.KONG_WANG; // 空亡（干支为键）

        String yearGanZhiXunKong = kongWang.get(getYearGanZhi()); // 年干支旬空
        String monthGanZhiXunKong = kongWang.get(getMonthGanZhi()); // 月干支旬空
        String dayGanZhiXunKong = kongWang.get(getDayGanZhi()); // 日干支旬空
        String hourGanZhiXunKong = kongWang.get(getHourGanZhi()); // 时干支旬空

        this.baZiXunKong = Arrays.asList(yearGanZhiXunKong, monthGanZhiXunKong, dayGanZhiXunKong, hourGanZhiXunKong);

    }

    /**
     * 计算上卦数、下卦数、动爻数
     */
    private void shangXiaGuaNumber() {

        /*
            计算方法（以农历计算）↓

                 上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
                 下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
                 动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
         */

        Map<String, Integer> diZhiShu = MeiHuaMap.DI_ZHI_SHU; // 地支对应的数字

        int yearNumber = diZhiShu.get(getYearZhi()); // 年数
        int monthNumber = getLunar().getMonth(); // 月数
        int dayNumber = getLunar().getDay(); // 日数
        int hourNumber = diZhiShu.get(getHourZhi()); // 时数

        // 1、计算上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
        int shangGuaNumber = (yearNumber + monthNumber + dayNumber) % 8;
        this.shangGuaNumber = shangGuaNumber == 0 ? 8 : shangGuaNumber;

        // 2、计算下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
        int xiaGuaNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 8;
        this.xiaGuaNumber = xiaGuaNumber == 0 ? 8 : xiaGuaNumber;

        // 3、计算动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
        int dongYaoNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 6;
        this.dongYaoNumber = dongYaoNumber == 0 ? 6 : dongYaoNumber;

    }

    /**
     * 判断用卦、体卦
     */
    private void isYongTi() {

        this.shangGuaYong = getDongYaoNumber() > 3;
        this.xiaGuaYong = !getShangGuaYong();

    }

    /**
     * 计算上卦及卦象
     */
    private void shangGua() {

        this.shangGua = MeiHuaMap.XIAN_YIAN_BA_GUA.get(getShangGuaNumber()); // 根据上卦数获取上卦
        this.shangGuaAs = MeiHuaMap.BA_GUA_AS.get(getShangGua()); // 根据上卦获取上卦卦象

    }

    /**
     * 计算下卦及卦象
     */
    private void xiaGua() {

        this.xiaGua = MeiHuaMap.XIAN_YIAN_BA_GUA.get(getXiaGuaNumber()); // 根据下卦数获取下卦
        this.xiaGuaAs = MeiHuaMap.BA_GUA_AS.get(getXiaGua()); // 根据下卦获取下卦卦象

    }

    /**
     * 计算动爻
     */
    private void dongYao() {

        this.dongYao = CommonUtil.shuToHan(getDongYaoNumber());

    }

    /**
     * 计算本卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
     */
    private void benGua() {

        // 设置数据
        this.benGua = MeiHuaMap.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(getShangGuaNumber(), getXiaGuaNumber())); // 卦名
        this.benGuaAs = MeiHuaMap.LIU_SHI_SI_GUA_AS.get(getBenGua()); // 卦象
        this.benGuaShangGua = getShangGua(); // 上卦卦名
        this.benGuaShangGuaAs = getShangGuaAs(); // 上卦卦象
        this.benGuaXiaGua = getXiaGua(); // 下卦卦名
        this.benGuaXiaGuaAs = getXiaGuaAs(); // 下卦卦象
        this.benGuaGuaCi = MeiHuaMap.LIU_SHI_SI_GUA_GUA_CI.get(getBenGua()); // 卦辞
        this.benGuaLiuYaoName = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBenGuaAs()); // 六爻爻名
        this.benGuaLiuYaoAs = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getBenGuaAs()); // 六爻爻象
        this.benGuaLiuYaoYaoCi = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBenGuaAs()); // 六爻爻辞
        this.benYongTiLink = getYongTiLink(getBenGuaShangGua(), getBenGuaXiaGua(), getBenGua() + "卦代表事物初始、开始阶段的信息或目前的情况；"); // 用卦与体卦关系

    }

    /**
     * 计算变卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
     */
    private void bianGua() {

        // 设置数据
        int bianShangGuaNumber; // 变卦的上卦数
        int bianXiaGuaNumber; // 变卦的下卦数
        if (getDongYaoNumber() >= 1 && getDongYaoNumber() <= 3) {
            // 1.1、动爻数为(1\2\3)时：上卦不变、下卦变
            bianXiaGuaNumber = MeiHuaMap.BIAN_GUA.get(getXiaGuaNumber()).get(getDongYaoNumber() - 1); // 下卦数
            this.bianGua = MeiHuaMap.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(getShangGuaNumber(), bianXiaGuaNumber)); // 根据上卦数和下卦数获取变卦
        } else {
            // 1.2、动爻数为(4\5\6)时：上卦变、下卦不变
            bianShangGuaNumber = MeiHuaMap.BIAN_GUA.get(getShangGuaNumber()).get(getDongYaoNumber() - 4); // 上卦数
            this.bianGua = MeiHuaMap.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(bianShangGuaNumber, getXiaGuaNumber())); // 根据上卦数和下卦数获取变卦
        }
        this.bianGuaAs = MeiHuaMap.LIU_SHI_SI_GUA_AS.get(getBianGua()); // 卦象

        // 2、变卦的上卦及下卦
        Map<String, List<String>> liuShiSiGuaTwoGuaName = MeiHuaMap.LIU_SHI_SI_GUA_TWO_GUA_NAME; // 六十四卦包含的两个卦名
        List<String> list = liuShiSiGuaTwoGuaName.get(getBianGua());
        this.bianGuaShangGua = list.get(0); // 上卦卦名
        this.bianGuaXiaGua = list.get(1); // 下卦卦名

        // 3、变卦的上卦卦象及下卦卦象
        this.bianGuaShangGuaAs = MeiHuaMap.BA_GUA_AS.get(getBianGuaShangGua()); // 上卦卦象
        this.bianGuaXiaGuaAs = MeiHuaMap.BA_GUA_AS.get(getBianGuaXiaGua()); // 下卦卦象

        this.bianGuaGuaCi = MeiHuaMap.LIU_SHI_SI_GUA_GUA_CI.get(getBianGua()); // 卦辞
        this.bianGuaLiuYaoName = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBianGuaAs()); // 六爻爻名
        this.bianGuaLiuYaoAs = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getBianGuaAs()); // 六爻爻象
        this.bianGuaLiuYaoYaoCi = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBianGuaAs()); // 六爻爻辞
        this.bianYongTiLink = getYongTiLink(getBianGuaShangGua(), getBianGuaXiaGua(), getBianGua() + "卦代表事物发展变化的最终结果；"); // 用卦与体卦关系

    }

    /**
     * 计算互卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
     */
    private void huGua() {

        Map<String, String> map = getGua(0);

        this.huGua = map.get("guaName"); // 卦名
        this.huGuaAs = map.get("guaAs"); // 卦象
        this.huGuaShangGua = map.get("shangGua"); // 上卦卦名
        this.huGuaShangGuaAs = map.get("shangGuaAs"); // 上卦卦象
        this.huGuaXiaGua = map.get("xiaGua"); // 下卦卦名
        this.huGuaXiaGuaAs = map.get("xiaGuaAs"); // 下卦卦象
        this.huGuaGuaCi = MeiHuaMap.LIU_SHI_SI_GUA_GUA_CI.get(getHuGua()); // 卦辞
        this.huGuaLiuYaoName = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getHuGuaAs()); // 六爻爻名
        this.huGuaLiuYaoAs = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getHuGuaAs()); // 六爻爻象
        this.huGuaLiuYaoYaoCi = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getHuGuaAs()); // 六爻爻辞
        this.huYongTiLink = getYongTiLink(getHuGuaShangGua(), getHuGuaXiaGua(), getHuGua() + "卦代表事物发展的过程；"); // 用卦与体卦关系


    }

    /**
     * 计算错卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
     */
    private void cuoGua() {

        Map<String, String> map = getGua(1);

        this.cuoGua = map.get("guaName"); // 卦名
        this.cuoGuaAs = map.get("guaAs"); // 卦象
        this.cuoGuaShangGua = map.get("shangGua"); // 上卦卦名
        this.cuoGuaShangGuaAs = map.get("shangGuaAs"); // 上卦卦象
        this.cuoGuaXiaGua = map.get("xiaGua"); // 下卦卦名
        this.cuoGuaXiaGuaAs = map.get("xiaGuaAs"); // 下卦卦象
        this.cuoGuaGuaCi = MeiHuaMap.LIU_SHI_SI_GUA_GUA_CI.get(getCuoGua()); // 卦辞
        this.cuoGuaLiuYaoName = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getCuoGuaAs()); // 六爻爻名
        this.cuoGuaLiuYaoAs = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getCuoGuaAs()); // 六爻爻象
        this.cuoGuaLiuYaoYaoCi = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getCuoGuaAs()); // 六爻爻辞
        this.cuoYongTiLink = getYongTiLink(getCuoGuaShangGua(), getCuoGuaXiaGua(), getCuoGua() + "卦代表事物的危机或转机，若问题的结果（变卦）为吉，则代表危机，若问题的结果（变卦）为凶，则代表危机的转机；"); // 用卦与体卦关系


    }

    /**
     * 计算综卦的卦名、卦象、上卦卦名、上卦卦象、下卦卦名、下卦卦象、卦辞、六爻爻名、六爻爻象、六爻爻辞、用卦与体卦关系
     */
    private void zongGua() {

        Map<String, String> map = getGua(2);

        this.zongGua = map.get("guaName"); // 卦名
        this.zongGuaAs = map.get("guaAs"); // 卦象
        this.zongGuaShangGua = map.get("shangGua"); // 上卦卦名
        this.zongGuaShangGuaAs = map.get("shangGuaAs"); // 上卦卦象
        this.zongGuaXiaGua = map.get("xiaGua"); // 下卦卦名
        this.zongGuaXiaGuaAs = map.get("xiaGuaAs"); // 下卦卦象
        this.zongGuaGuaCi = MeiHuaMap.LIU_SHI_SI_GUA_GUA_CI.get(getZongGua()); // 卦辞
        this.zongGuaLiuYaoName = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getZongGuaAs()); // 六爻爻名
        this.zongGuaLiuYaoAs = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getZongGuaAs()); // 六爻爻象
        this.zongGuaLiuYaoYaoCi = MeiHuaMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getZongGuaAs()); // 六爻爻辞
        this.zongYongTiLink = getYongTiLink(getZongGuaShangGua(), getZongGuaXiaGua(), getZongGua() + "卦代表事物的另一个面，以第三者角度综合观察这个事物；"); // 用卦与体卦关系


    }

    /**
     * 计算卦码
     */
    private void guaMa() {

        this.guaMa = "" + getShangGuaNumber() + getXiaGuaNumber() + getDongYaoNumber();

    }

//------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 返回互卦、错卦、综卦信息
     *
     * @param index 0:互卦。1:错卦。2:综卦
     * @return 互卦、错卦、综卦信息
     */
    private Map<String, String> getGua(int index) {

        // 1、获取卦名及卦象
        String guaName = MeiHuaMap.HU_CUO_ZONG.get(getBenGua()).get(index); // 卦名
        String guaAs = MeiHuaMap.LIU_SHI_SI_GUA_AS.get(guaName);// 卦象

        // 2、卦的上卦及下卦
        Map<String, List<String>> liuShiSiGuaTwoGuaName = MeiHuaMap.LIU_SHI_SI_GUA_TWO_GUA_NAME; // 六十四卦包含的两个卦名
        List<String> list = liuShiSiGuaTwoGuaName.get(guaName);
        String shangGua = list.get(0); // 卦的上卦
        String xiaGua = list.get(1); // 卦的下卦

        // 3、卦的上卦卦象及下卦卦象
        Map<String, String> baGuaAs = MeiHuaMap.BA_GUA_AS; // 八卦卦象
        String shangGuaAs = baGuaAs.get(shangGua); // 卦的上卦卦象
        String xiaGuaAs = baGuaAs.get(xiaGua); // 卦的下卦卦象

        // 4、添加卦信息并返回
        Map<String, String> map = new HashMap<>();
        map.put("guaName", guaName); // 卦名
        map.put("guaAs", guaAs); // 卦名
        map.put("shangGua", shangGua); // 卦的上卦
        map.put("xiaGua", xiaGua); // 卦的下卦
        map.put("shangGuaAs", shangGuaAs); // 卦的上卦卦象
        map.put("xiaGuaAs", xiaGuaAs); // 卦的下卦卦象
        return map;

    }

    /**
     * 返回用卦、体卦信息
     *
     * @param shangGua 上卦
     * @param xiaGua   下卦
     * @param mark     本卦、变卦、互卦、错卦、综卦
     * @return 用卦、体卦信息
     */
    private String getYongTiLink(String shangGua, String xiaGua, String mark) {

        String yongGua; // 用卦
        String tiGua; // 体卦
        String yongGuaMark; // 用卦标识
        String tiGuaMark; // 体卦标识

        // 1、判断上卦，下卦
        if (getShangGuaYong()) {
            yongGua = shangGua; // 用卦为上卦
            yongGuaMark = "上卦";
            tiGua = xiaGua; // 体卦为下卦
            tiGuaMark = "下卦";
        } else {
            tiGua = shangGua; // 体卦为上卦
            tiGuaMark = "上卦";
            yongGua = xiaGua; // 用卦为下卦
            yongGuaMark = "下卦";
        }

        // 2、获取用卦与体卦之间的关系
        Map<String, String> baGuaWuXing = MeiHuaMap.BA_GUA_WU_XING; // 八卦五行
        String info = mark + yongGuaMark + yongGua + "(" + baGuaWuXing.get(yongGua) + ")为用卦、" + tiGuaMark + tiGua + "(" + baGuaWuXing.get(tiGua) + ")为体卦，";
        Map<String, String> yongTiGuanXi = MeiHuaMap.YONG_TI_GUAN_XI; // 用卦与体卦的关系（用卦+体卦）

        // 3、返回信息
        return info + yongTiGuanXi.get(yongGua + tiGua);

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
        sb.append("卦码:").append(getGuaMa());
        sb.append("   ");
        sb.append("上卦:").append(getShangGua()).append("(").append(getShangGuaAs()).append(")");
        sb.append("   ");
        sb.append("下卦:").append(getXiaGua()).append("(").append(getXiaGuaAs()).append(")");
        sb.append("   ");
        sb.append("动爻:").append(getDongYao());
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

        return sb.toString();

    }


}
