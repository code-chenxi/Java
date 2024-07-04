[TOC]

<div style="page-break-after: always;"> </div>

# 第二章 Java 基础语法

## 标识符

<font title="blue"> 111 </font> 111

------

### 什么是标识符

1. 在 Java 中，标识符是用来给变量、方法、类和包等命名的 <span alt="wavy"> 字符序列 </span>。
2. 标识符的长度没有限制，但是建议使用有意义的、简洁的标识符，以提高代码的可读性和可维护性。

### 标识符可以标识什么

1. 变量名
2. 方法名
3. 类名、接口名、枚举名、注解名
4. 包名
5. 常量名

### 标识符命名规则

1. 标识符 <span alt="wavy"> 可以由字母、数字、下划线(_)和美元符号($)组成 </span >，不能含有其他符号。（Java 支持全球所有语言，所以这里的字母指的是任何一个国家的文字都可以）
2. 标识符不能以数字开头。
3. 标识符不能是 Java 中的关键字，如 public、class、void 等。
4. 标识符是区分大小写的，即 Foo 和 foo 是两个不同的标识符。
5. 标识符的长度没有限制，但是 Java 建议使用有意义的、简短的标识符。

### 标识符命名规范

1. 见名知意
2. 驼峰式命名方式
3. 类名、接口名、枚举、注解：首字母大写，后面每个单词首字母大写。（StudentService、UserService）
4. 变量名和方法名：首字母小写，后面每个单词首字母大写。（doSome，doOther）
5. 常量名：全部大写，每个单词用下划线连接。（LOGIN_SUCCESS，SYSTEM ERROR）
6. 包名：全部小写。

## 关键字

------

### 什么是关键字

Java 关键字是 Java 编程语言中预定义的具有特殊含义的单词，这些单词不能被用作标识符，而是在语法中有特定的用法和限制。

### Java 关键字有哪些

1. Java 关键字都是小写的。
2. abstract, assert, boolean, break, byte, case, catch, char, class, continue, default, do, double, else, enum, extends, final, finally, float, for, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while
3. Java 保留字：goto，const

## 字面量

------

### 什么是字面量

字面量指的是在程序中直接使用的数据，字面量是 Java 中最基本的表达式，不需要进行计算或转换，直接使用即可。

### Java 中有哪些字面量

1. 整数型：10、-5、0、100
2. 浮点型：3.14、-0.5、1.0
3. 布尔型：true、false
4. 字符型：'a'、'b'、'c'、'1'、'2'、'国'
5. 字符串型："Hello"、"World"、"Java"、"你好呀"
6. 加号运算符 +
   1. 作用 1：求和（当加号两边都是数字时进行求和运算）
   2. 作用 2：字符串拼接（当加号两边有任意一边是字符串类型时会进行字符串拼接，结果还是一个字符串）

## 变量

------

### 什么是变量

1. 变量是内存当中的一块空间。是计算机中存储数据最基本的单元。
2. 变量三要素：
   - 数据类型（决定空间大小）【int, double, String】
   - 变量名（只要是合法的标识符即可）
   - 变量值（变量中具体存储的数据）
3. 变量的声明、赋值、访问
   - int i; // 声明一个整数型的变量，起名 i
   - i = 100; // 给变量 i 赋值 100
   - System.out.println(i); // 访问 i 变量：读操作
   - i = 200; // 访问 i 变量：改操作【给变量 i 重新赋值 200】

### 变量的作用

1. 变量的存在会让程序更加便于维护。

   System.out.println(100 + 111);

   System.out.println(100 + 222);

   以上代码的设计就不如以下的代码：

   int num = 100;

   System.out.println(num + 111);

   System.out.println(num + 222);

2. 变量的存在可以增强程序的可读性。

System.out.println(3.14 * 10 * 10);

以上代码的设计就不如以下的代码：

double π = 3.14;

int r = 10;

System.out.println(π * r * r);

## 二进制

------

## 八进制与十六进制

## 原码反码补码

## 

## 运算符

------

## 控制语句

> [!TIP]
>
> 控制语句：<span alt="wavy"> 用于控制程序的执行流程，改变程序执行的次序。</span>
>
> 1. 分支语句
>    1. if 语句
>    2. switch 语句
> 2. 循环语句
>    1. for 循环
>    2. while 循环
>    3. do while 循环
> 3. 跳转语句
>    1. break 语句
>    2. continue 语句

### 分支语句 if

if 语句的第一种写法：

```java
if(布尔表达式){
	分支语句;
}
```

> [!NOTE]
>
> 原理：<span alt="wavy"> 如果布尔表达式 true，则执行分支语句。如果为 false，则不执行。</span>

### 分支语句 switch

### 循环语句 for

### 循环语句 while

### 循环语句 do while

### 跳转语句

## 方法

