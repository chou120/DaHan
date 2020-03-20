# Table of Contents

1.  [潜水艇小游戏](#854CE09D-C557-46D3-8154-F5FC03505F56)
    1.  [简介](#854CE09D)
    2.  [canvas创建画布](#854CE10)
    3.  [添加潜水艇组件](#854CE29DC557)
    4.  []
    5.  [总结](#F5FC03505F56)

<a id="854CE09D-C557-46D3-8154-F5FC03505F56"></a>

# 潜水艇小游戏

本文描述了基于 `JavaScript` 实现的潜水艇游戏的动画演示。

> 提示：全文阅读约10分钟。

![img](img/854CE09D-C557-46D3-8154-F5FC03505F56.png)


<a id="854CE09D"></a>

## 简介

这篇文章的目的是通过潜水艇遇到障碍物问题以及通过障碍物的分数的统计问题的动态求解向大家演示如何使用 `Html`, `CSS`, `JavaScript` 快速实现一个页面游戏。
   
   
<a id="854CE09D"></a>

## 创建画布
创建画布其实就是支持游戏在页面上运行的一个载体
```javascript
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<style>
canvas {
    border: 1px solid #d3d3d3;
    background-color: #f1f1f1;
}
</style>
</head>
<body onload="startGame()">
<script>
function startGame() {
    myGameArea.start();
}

var myGameArea = {
    canvas : document.createElement("canvas"),
    start : function() {
        this.canvas.width = 480;
        this.canvas.height = 270;
        this.context = this.canvas.getContext("2d");
        document.body.insertBefore(this.canvas, document.body.childNodes[0]);
    }
}
</script>
<p>We have created a game area! (or at least an empty canvas)</p>
</body>
</html>

```
`<style>`里面是给画布添加一个背景色 
`insertBefore()`函数是把画布添加到页面上
`myGameArea.start()`表示调用`start()函数`启动画布


<a id="854CE29DC557"></a>

## 添加潜水艇组件
如实例图所示,使用`正方形`代替`潜水艇`完成组件操作,创建一个组件构造函数，使您可以将组件添加到游戏区域。核心代码如下
```javascript
var myGamePiece;
function startGame() {
    myGameArea.start();
    myGamePiece = new component(30, 30, "red", 10, 120);
}

var myGameArea = {
    canvas : document.createElement("canvas"),
    start : function() {
        this.canvas.width = 480;
        this.canvas.height = 270;
        this.context = this.canvas.getContext("2d");
        document.body.insertBefore(this.canvas, document.body.childNodes[0]);
    }
}

function component(width, height, color, x, y) {
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;    
    ctx = myGameArea.context;
    ctx.fillStyle = color;
    ctx.fillRect(this.x, this.y, this.width, this.height);
}
```
`component()函数`用来创建`正方形`组件,其中包括了`正方形`的长,宽,颜色和在画布位置中的位置




<a id="F5FC03505F56"></a>

## 总结

使用HTML，CSS和JavaScript可以在只依赖浏览器的情况下进行该动画的展示：

将源代码包解压到你的本地目录，再打开 `Game.html` 文件（双击就可以使用你的默认浏览器打开），你就可以看到该程序的运行状态。

该程序仅包含一个html文件和一个图片文件，完整的展示了潜水艇小游戏的演示过程。

