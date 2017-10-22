
<html>
    <head>
        <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.4/angular-material.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.11/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.11/angular-animate.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.11/angular-aria.min.js"></script>


        <!-- AngularJS Material Javascript now available via Google CDN; version 1.1.4 used here -->
        <script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.4/angular-material.min.js"></script>
        <script type="text/javascript">
            var app = angular.module('myApp', ['ngMaterial']);
            app.run(function ($rootScope) {
                console.log('i am running')
            });
            app.controller('loginController', function ($scope) {
                console.log('I am running1');
                $scope.submit = function () {
                    alert("login");
                }
            })
        </script>
    </head>
    <body>
        <div ng-app="myApp" ng-controller="loginController">
            <div layout="column" layout-fill>
                <md-toolbar class="headerclass">

                    <div class="md-toolbar-tools headerContainer" >
                        <div class="logo"  md-truncate flex>
                            <img src="http://www.edu-tree.com/ttd/demo_icon_01-copy-300x283.png">
                        </div>
                        <form name="userForm">

                            <div layout-gt-sm="row" class="loginForm">
                                <md-input-container class="md-block headerinput" >
                                    <label>Email or Phone</label>
                                    <input ng-model="login.email">
                                </md-input-container>

                                <md-input-container class="md-block headerinput">
                                    <label>Password</label>
                                    <input type="password" ng-model="login.password">
                                </md-input-container>
                                <md-button class="md-raised headerbt">Login</md-button>
                            </div>
                        </form>
                    </div>

                </md-toolbar>
                <div layout-fill class="mainContainer">
                    <div layout-fill class="cardBackground">
                        <div class="layout-fill fullContainer">
                            <div class="videoClip">
                               <!--  <embed src="https://www.youtube.com/watch?v=AnUhbgCNs1g" allowfullscreen="true" width="100%" height="400"> -->
                               <video width="100%" controls>
                                    <source src="mov_bbb.mp4" type="video/mp4">
                                   
                                   
                                </video>

                            </div>

                            <md-card  class="formcard">
                                <div class="cardtitle">
                                    <h2 class="titteTop">Be great at what you do</h2>
                                    <h3 class="titlebottom">Get started - it's free</h3>
                                </div>

                                <md-card-actions  class="secondForm" layout-align="end center">
                                    <form name="projectForm" ng-submit="projectForm.$valid && submit()">
                                        <md-input-container class="md-block">
                                            <label>First Name</label>
                                            <input required name="firstName" ng-model="user.firstName">
                                            <div ng-messages="projectForm.clientName.$error">
                                                <div ng-message="required">This is required.</div>
                                            </div>
                                        </md-input-container>
                                        <md-input-container class="md-block">
                                            <label>Last Name</label>
                                            <input required name="lastName" ng-model="user.lastName">
                                            <div ng-messages="projectForm.clientName.$error">
                                                <div ng-message="required">This is required.</div>
                                            </div>
                                        </md-input-container>
                                        <md-input-container class="md-block">
                                            <label>Client Email</label>
                                            <input required type="email" name="clientEmail" ng-model="user.clientEmail"
                                                   minlength="10" maxlength="100" ng-pattern="/^.+@.+\..+$/" />

                                            <div ng-messages="projectForm.clientEmail.$error" role="alert">
                                                <div ng-message-exp="['required', 'minlength', 'maxlength', 'pattern']">
                                                    Your email must be between 10 and 100 characters long and look like an e-mail address.
                                                </div>
                                            </div>
                                        </md-input-container>
                                        <md-input-container class="md-block">
                                            <label>Password</label>
                                            <input type="password" required name="password" ng-model="user.password">
                                            <div ng-messages="projectForm.password.$error">
                                                <div ng-message="required">This is required.</div>
                                            </div>
                                        </md-input-container>
                                        <div class="agreement">By clicking Join now, you agree to the our User<br>
                                            Agreement,Privacy Policy and Cookie Policy</div>
                                        <md-button class="md-raised formbt" type="submit">Login</md-button>
                                    </form>
                                </md-card-actions>
                            </md-card>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <style>
        .headerclass{
            background-color:#3F5C9A !important;
        }
        .headerContainer{
            width:65%;
            margin:0 auto;
        }
        .logo img{
            width:65px;
        }
        .loginForm{
            padding-top:47px;
        }
        .headerinput{
            width: 140px;
            font-size: 14px;
            margin-right: 10px;
        }
        .headerContainer md-input-container label {
            color: #fff;
        }

        /* When the input is focused */
        .headerContainer md-input-container.md-input-focused label {
            color: #fff;
        }
        .headerContainer md-input-container:not(.md-input-invalid).md-input-focused label {
            color: #fff;
        }
        .headerContainer md-input-container:not(.md-input-invalid).md-input-has-value label{
            color: #fff
        }
        .headerinput input{
            color:#fff;
        }
        .headerContainer .md-input {
            border-color:#fff !important;
        }
        .headerbt{
            height: 30px;
            color: #fff !important;
            background-color: #3F5C9A !important;
            margin-top: 15px !important;
        }
        .mainContainer{
            background-image: url("http://images.all-free-download.com/images/graphiclarge/clouds_in_sky_background_192377.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
        .cardBackground{
            background-color:rgba(0,0,0,0.5);
        }
        .formcard{
            width: 370px;
            /*            margin: 0 auto;
                        top: 45px;
                        position: relative;*/
            background: #EDF0F3;
            float: right;
        }
        .cardtitle{
            text-align: center;
            border-bottom: 1px solid rgba(0,0,0,0.15);
            padding-bottom: 10px;
            background: #F6F8FA;
        }
        .secondForm md-input-container {
            margin: 7px 0;
            padding-top: 10px;
        }
        .titteTop{
            line-height: 32px;
            font-weight: 200;
            color: rgba(0,0,0,0.85);
            font-size: 26px;
            background: #F6F8FA;
            text-align: center;
            /* padding: 16px 32px 8px 32px; */
            margin: 25px 0px 0 0;
            -webkit-margin-after: 0.35em;
            -webkit-margin-before: 0.75em;
        }
        .formbt{
            color: rgba(255,255,255,0.85)!important;
            font-size: 17px;
            font-weight: 500;
            width: 352px;
            background-color: #0084bf !important;
            border: 0;
            border-radius: 2px;
            box-sizing: border-box;

        }
        .titlebottom{
            line-height: 24px;
            font-weight: 400;
            color: rgba(0,0,0,0.85);
            font-size: 17px;
            position: relative;
            z-index: 1;
            background: #F6F8FA;
            text-align: center;
            /*padding: 0 8px 16px;*/
            -webkit-margin-before: 0px;
            -webkit-margin-after: 0.55em;
        }
        .agreement{
            line-height: 16px;
            font-weight: 400;
            color: rgba(0,0,0,0.55);
            font-size: 13px;
            text-align: center;
            display: block;
            margin: 0px 16px 15px;
        }
        .fullContainer{
            width: 90%;
            margin: 0 auto;
            padding-top: 50px;
        }
        .videoClip{
            width:60%;
            float:left;
            margin-top:10px;
        }
    </style>
</html>


