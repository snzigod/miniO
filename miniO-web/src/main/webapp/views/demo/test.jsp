<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<html ng-app="ui.bootstrap.demo" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" />
<title></title>

<script
	src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script
	src="https://cdn.bootcss.com/angular-ui-bootstrap/2.5.0/ui-bootstrap-tpls.min.js"></script>
<script>
	angular.module('ui.bootstrap.demo', [ 'ui.bootstrap' ]).controller(
			'ModalDemoCtrl', function($scope, $uibModal, $log) {

				$scope.items = [ 'item1', 'item2', 'item3' ];

				$scope.open = function(size) {
					var modalInstance = $uibModal.open({
						templateUrl : 'myModalContent.html',
						controller : 'ModalInstanceCtrl',
						backdrop : "static",
						size : size,
						resolve : {
							items1 : function() {
								return $scope.items;
							}
						}
					});

					modalInstance.result.then(function(selectedItem) {
						$scope.selected = selectedItem;
					}, function() {
						$log.info('Modal dismissed at: ' + new Date());
					});
				};

				$scope.toggleAnimation = function() {
					$scope.animationsEnabled = !$scope.animationsEnabled;
				};

			});

	//$uibModalInstance是模态窗口的实例  
	angular.module('ui.bootstrap.demo').controller('ModalInstanceCtrl',
			function($scope, $uibModalInstance, items1) {
				$scope.items = items1;
				$scope.selected = {
					item : $scope.items[0]
				};

				$scope.ok = function() {
					$uibModalInstance.close($scope.selected.item);
				};

				$scope.cancel = function() {
					$uibModalInstance.dismiss('cancel');
				};
			});
</script>

</head>
<body>
	<div ng-controller="ModalDemoCtrl">
		<script type="text/ng-template" id="myModalContent.html">
            <div class="modal-header">
                <h3 class="modal-title">I'm a modal!</h3>
            </div>
            <div class="modal-body">
                <ul>
                    <li ng-repeat="item in items">
                        <a href="#" ng-click="$event.preventDefault(); selected.item = item">{{ item }}</a>
                    </li>
                </ul>
                Selected: <b>{{ selected.item }}</b>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" ng-click="ok()">OK</button>
                <button class="btn btn-warning" type="button" ng-click="cancel()">Cancel</button>
            </div>
        </script>

		<button type="button" class="btn btn-default" ng-click="open()">Open
			me!</button>
		<button type="button" class="btn btn-default" ng-click="open('lg')">Large
			modal</button>
		<button type="button" class="btn btn-default" ng-click="open('sm')">Small
			modal</button>
		<div ng-show="selected">Selection from a modal: {{ selected }}</div>
	</div>
</body>
</html>