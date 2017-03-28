<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!--图标库-->    

<link href="http://dujia.tcent.cn/jqmodule/icon/0.4.0/font.css" rel="stylesheet" />

<!--蓝色皮肤样式--> 

<link href="http://dujia.tcent.cn/jqmodule/skin/0.4.0/blue.css" rel="stylesheet" />

<!--jquery-->  

<script src="http://dujia.tcent.cn/jqmodule/jquery.js"></script>

<!--我们新版组件基于react开发-->  

<script src="http://dujia.tcent.cn/jqmodule/react.js"></script>

<script src="http://dujia.tcent.cn/jqmodule/react-dom.js"></script>

<!--组件使用模块加载方式-->

<script src="http://dujia.tcent.cn/jqmodule/require.js"></script>
<body class="skin-blue">
<div id="wrapper" class="wrapper"></div>
</body>
<script>

     requirejs.config({

          baseUrl: 'http://dujia.tcent.cn/jqmodule/'

      });
     require(["layout/0.4.0/layout"], function (Layout) {
         //菜单的初始化数据
         var menudata = [{
             title: "一级菜单",
             menuico: "settings",
             childs: [{
                 title: "二级菜单",
                 url: '/ui/home.html'
             }]
         }];

         //框架页初始化配置
         var _testOpt = {
             wrapper: "#wrapper",
             sideWidth: 230,
             logo: "",
             logoName: "大度假后台系统",
             logoIcon: "http://dujia.tcent.cn/jqmodule/layout/0.2.0/img/logo_icon.png",
             //promptText: " 待处理事项(590)",
             search: true,
             homePage: "/Home/Index",
             collapsed: true,//默认true折叠，false展开
             topMenuText: "切换项目",//下拉菜单名称
             topMenuIcon: "copy",//下拉菜单图标
             onSearch: function (v) {
                 console.log("aaaa" + v);
             },
             topMenu: [{
                 title: "服务中心",
                 menuico: "service",
                 id: "1"
             }, {
                 title: "监控中心",
                 menuico: "service",
                 id: "2"
             }],
             leftMenu: [{
                 title: "一级菜单",
                 menuico: "settings",
                 childs: [{
                     title: "二级菜单",
                     url: '/ui/home.html'
                 }]
             }],
             tools: {
                 items: [{
                     alt: "建",
                     //src: "/jqmodule/layout/0.2.0/img/logo_xiaoming.png",
                     type: 'icon',
                     res: function (item, event) {
                         // helper.openSuggest("");
                         console.log(item);
                     }
                 }]
             }
         };          

         //框架组件初始化
         var layout = new Layout(_testOpt);

         //监听顶部菜单点击事件
         layout.on("topmenu.item.select", function (e, item) {
             layout.bindMenu(menudata);
         });
         //监听搜索
         layout.on("layout.search", function (e, v) {
             console.log("search:" + v);
         });
         //顶部下拉菜单点击事件
         layout.on('item.click', function(e, id, text, obj){
             console.log(id);   
           console.log(text);  
         });     
         //初始化登录状态（该方法可放到异步中进行）
         layout.initLogin({
             headPortrait: "http://dujia.tcent.cn/assets/images/profile_small.jpg", //头像
             userName: "登录名", //用户名
             deptName: "前端架构组", //部门名称      
             loginout: '/Home/loginout',
             position: 'right'
         });
     });

</script>
</html>