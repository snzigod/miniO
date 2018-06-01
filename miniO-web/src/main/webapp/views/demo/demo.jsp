<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--页面标题-->
<title>Title</title>
<!--引入bootstrap样式-->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
</head>
<body>
	<div ng-app="" class="container">
		<h1>Welcome to SpringMVC Bootstrap AngularJS WebApp</h1>

		<p>
			名字 : <input type="text" ng-model="name">
		</p>
		<h1>Hello {{name}}</h1>
	</div>

	<!--引入jquery脚本-->
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"
		type="text/javascript"></script>
	<!--引入bootstrap脚本-->
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
		type="text/javascript"></script>
</body>
</html>