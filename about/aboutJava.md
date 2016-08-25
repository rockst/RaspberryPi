* Java SE: Java Standard Edition
* Java EE: Java Enterprise Edition
** JSP, Servlet
* Java ME: Java Micro Edition
** headless

Java 8 Lambda
* Compact Profiles
* Java SE Emvedded JDK： jrecreate

確認是否安裝 Java SE 8 SDK
* java -version

Embedded System 嵌入式系統
* Java SE embedded 7
* headless: 不需提供圖形介面，如感應卡片 
* headful: 需提供圖形介面，如提款機
* 不需要鍵盤滑鼠
* 紅外線、溫度、人體感應或 NFC
* 低階的硬體設備運作：ARM, Intel Atom
* ARM11:VFP, ARMv6
* Java SE embedded 8
* Compact Profiles 架構
** compact1, compact2, compact3
* javac -profile compact1 xxx.java
* jdeps -P xxx.class