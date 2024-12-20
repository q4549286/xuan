<h1 align="center" style="text-shadow:2px 2px 5px rgb(200,200,200);">
    常用排盘工具
</h1>
<p align="center">
    在线地址:
    <a href="https://muxuange.cn/tool" target="_blank">
    	https://muxuange.cn/tool
    </a>
</p>
<p align="center" style="font-size:17px; background-color:rgb(245, 245, 245); border-radius:50px;">
    v1.0.41
</p>


# **【八字排盘】**

🔈<b>八字排盘</b>提供基础信息，如：八字、主星、地势、空亡、神煞等。

## 代码示例

```java
public class BaZiTest {
    public static void main(String[] args) {
        // 使用公历年月日时分秒初始化
        BaZi baZi = new BaZi(2024, 1, 1, 0, 0, 0);
        System.out.println(baZi);
    }
}
```

输出结果（部分）：

```
公历:2024年1月1日0时0分0秒   农历:二〇二三年冬月二十(早)子时   星期:周一   八字:[癸卯, 甲子, 甲子, 甲子]   八字五行:[水木, 木水, 木水, 木水]   八字纳音:[金箔金, 海中金, 海中金, 海中金]   八字旬空:[辰巳, 戌亥, 戌亥, 戌亥]   年干支主星:正印   月干支主星:比肩   日干支主星:元男   时干支主星:比肩   年支藏干:[乙]   月支藏干:[癸]   日支藏干:[癸]   时支藏干:[癸]   年干支副星:[劫财]   月干支副星:[正印]   日干支副星:[正印]   时干支副星:[正印]   年支地势:帝旺   月支地势:沐浴   日支地势:沐浴   时支地势:沐浴   胎元:乙卯   胎息:己丑   命宫:丁巳   身宫:癸丑
```

### 效果预览

![paipan](https://muxuange-pic.oss-cn-qingdao.aliyuncs.com/pic/fe3f733e-4541-499d-ba0e-42238f2e0c44.png)

=========================================================

# 【**奇门排盘**】

🔈<b>奇门排盘</b>提供基础信息，如：地盘、天盘、人盘、神盘、动应、克应等。

## 代码示例（转盘）

```java
public class QiMenTest {
    public static void main(String[] args) {
        // 使用公历年月日时分秒初始化
        ZhuanQiMen qiMen = new ZhuanQiMen(2024, 1, 1, 0, 0, 0);
        System.out.println(qiMen);
    }
}
```

输出结果（部分）：

```
公历:2024年1月1日0时0分0秒   农历:二〇二三年冬月二十(早)子时   星期:周一   八字:[癸卯, 甲子, 甲子, 甲子]   八字五行:[水木, 木水, 木水, 木水]   八字纳音:[金箔金, 海中金, 海中金, 海中金]   八字旬空:[辰巳, 戌亥, 戌亥, 戌亥]   局数:阳遁1局   旬首:甲子   值符:天蓬   值使:休门   天乙:天蓬   地乙:休门   太乙:休门   地盘:[戊, 己, 庚, 辛, 壬, 癸, 丁, 丙, 乙]   天盘:[天蓬, 芮禽, 天冲, 天辅, , 天心, 天柱, 天任, 天英]   人盘:[休门, 死门, 伤门, 杜门, , 开门, 惊门, 生门, 景门]   神盘:[值符, 玄武, 太阴, 六合, , 九天, 九地, 螣蛇, 白虎]   六仪击刑:[戌未相刑(己落坤二宫)]   奇仪入墓:[辛入墓(巽四宫)]   月将:丑   月将神:大吉
```

### 效果预览（转盘）

![paipan](https://muxuange-pic.oss-cn-qingdao.aliyuncs.com/pic/6ce3112f-e792-49ee-8058-1e58b3b3a568.png)

## 代码示例（飞盘）

```java
public class QiMenTest {
    public static void main(String[] args) {
        // 使用公历年月日时分秒初始化
        FeiQiMen qiMen = new FeiQiMen(2024, 1, 1, 0, 0, 0);
        System.out.println(qiMen);
    }
}
```

输出结果（部分）：

```
公历:2024年1月1日0时0分0秒   农历:二〇二三年冬月二十(早)子时   星期:周一   八字:[癸卯, 甲子, 甲子, 甲子]   八字五行:[水木, 木水, 木水, 木水]   八字纳音:[金箔金, 海中金, 海中金, 海中金]   八字旬空:[辰巳, 戌亥, 戌亥, 戌亥]   符头:甲子   节气:冬至上元   局数:阳遁1局   旬首:甲子   值符:天蓬   值使:休门   天乙:天蓬   地乙:休门   太乙:休门   地盘:[戊, 己, 庚, 辛, 壬, 癸, 丁, 丙, 乙]   天盘:[天蓬, 天芮, 天冲, 天辅, 天禽, 天心, 天柱, 天任, 天英]   人盘:[休门, 死门, 伤门, 杜门, 中门, 开门, 惊门, 生门, 景门]   神盘:[值符, 螣蛇, 太阴, 六合, 勾陈, 太常, 朱雀, 九地, 九天]   六仪击刑:[戌未相刑(己落坤二宫)]   奇仪入墓:[辛入墓(巽四宫)]   月将:丑   月将神:大吉
```

### 效果预览（飞盘）

![paipan](https://muxuange-pic.oss-cn-qingdao.aliyuncs.com/pic/c20de93a-f042-47b9-b10e-74aea07e3073.png)

=========================================================

# **【六爻起卦】**

🔈<b>六爻起卦</b>提供基础信息，如：八字、五行、空亡、世应、六亲等。

## 代码示例

```java
public class LiuYaoTest {
    public static void main(String[] args) {
        // 使用公历年月日时分秒初始化
        LiuYao liuYao = new LiuYao(2024, 1, 1, 0, 0, 0);
        System.out.println(liuYao);
    }
}
```

输出结果（部分）：

```
公历:2024年1月1日0时0分0秒   农历:二〇二三年冬月二十(早)子时   星期:周一   八字:[癸卯, 甲子, 甲子, 甲子]   八字五行:[水木, 木水, 木水, 木水]   八字纳音:[金箔金, 海中金, 海中金, 海中金]   上卦:离(☲)   下卦:震(☳)   本卦:火雷噬嗑(䷔)   变卦:震为雷(䷲)   互卦:水山蹇(䷦)   错卦:水风井(䷯)   综卦:山火贲(䷕)   伏卦:巽为风(䷸)   驿马:寅   天马:寅   天元禄:寅   天乙贵人:丑未   太极贵人:子   天德贵人:巽巳   月德贵人:庚   符印:子午   咸池:酉   天喜:未   皇恩:卯   文昌:巳   华盖:null   将星:卯   灾煞:午   劫煞:巳   谋星:戌   天医:亥
```

### 效果预览

![paipan](https://muxuange-pic.oss-cn-qingdao.aliyuncs.com/pic/53a9912a-7418-4053-9a36-bd0b931bdfbc.png)

=========================================================

# **【梅花易数起卦】**

🔈<b>梅花易数起卦</b>提供基础信息，如：上卦、下卦、本卦、变卦、互卦等。

## 代码示例

```java
public class MeiHuaTest {
    public static void main(String[] args) {
        // 使用公历年月日时分秒初始化
        MeiHua meiHua = new MeiHua(2024, 1, 1, 0, 0, 0);
        System.out.println(meiHua);
    }
}
```

输出结果（部分）：

```
公历:2024年1月1日0时0分0秒   农历:二〇二三年冬月二十(早)子时   星期:周一   八字:[癸卯, 甲子, 甲子, 甲子]   八字五行:[水木, 木水, 木水, 木水]   八字纳音:[金箔金, 海中金, 海中金, 海中金]   卦码:346   上卦:离(☲)   下卦:震(☳)   动爻:六   本卦:火雷噬嗑(䷔)   变卦:震为雷(䷲)   互卦:水山蹇(䷦)   错卦:水风井(䷯)   综卦:山火贲(䷕)
```

### 效果预览

![paipan](https://muxuange-pic.oss-cn-qingdao.aliyuncs.com/pic/929de5cb-761c-4505-97b5-429b359eaed1.png)

<p align="center" style="background-color:rgb(245, 245, 245); border-radius:50px; color:rgb(193, 155, 79);">
    运行环境：JDK8
</p>
<p align="right" style="margin:-11px 0 -11px 0; color:green;">
    ℹ 代码仅供参考
</p>