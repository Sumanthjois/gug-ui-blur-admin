var  signup = angular.module("Signup",[]);
signup.controller("SignupController",function($scope,$http,$window){
   $scope.signup = function(){
        $http({
           method:'POST',
           url:'/signup',
           data:"username="+$scope.username+"&password="+$scope.password+"&email="+$scope.email,
           headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
              }
        }).success(function(data,status){
            alert(data.message);
            $window.location.href = "/index.html";
        }).error(function(data,status){
            alert("error");
        });
    }
    
});

