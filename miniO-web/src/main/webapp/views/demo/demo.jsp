<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--页面标题-->
<title>demo</title>
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

		<div class="btn-group">
			<button type="button" class="btn btn-default">按钮 1</button>
			<button type="button" class="btn btn-default">按钮 2</button>

			<div class="btn-group">
				<button type="button" class="btn btn-default dropdown-toggle"
					data-toggle="dropdown">
					下列 <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="http://www.baidu.com" target="blank">下拉链接 1</a></li>
					<li><a href="http://www.baidu.com" target="blank">下拉链接 2</a></li>
				</ul>
			</div>
		</div>

		<br> <br>
		<p>
			名字 : <input type="text" ng-model="percent">
		</p>
		<div class="progress progress-striped">
			<div class="progress-bar progress-bar-success" role="progressbar"
				aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
				style="width: {{percent}}%;">
				<span class="sr-only">90% 完成（成功）</span>
			</div>
		</div>
		<div class="progress progress-striped">
			<div class="progress-bar progress-bar-info" role="progressbar"
				aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
				style="width: 30%;">
				<span class="sr-only">30% 完成（信息）</span>
			</div>
		</div>
		<div class="progress progress-striped">
			<div class="progress-bar progress-bar-warning" role="progressbar"
				aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
				style="width: 20%;">
				<span class="sr-only">20% 完成（警告）</span>
			</div>
		</div>
		<div class="progress progress-striped">
			<div class="progress-bar progress-bar-danger" role="progressbar"
				aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
				style="width: 10%;">
				<span class="sr-only">10% 完成（危险）</span>
			</div>
		</div>
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