gx.evt.autoSkip=!1;gx.define("iniciocolaveco",!1,function(){this.ServerClass="iniciocolaveco";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.iniciocolaveco";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e11152_client=function(){return this.executeServerEvent("'SALIR'",!1,null,!1,!1)};this.e13152_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e14152_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6];this.GXLastCtrlId=6;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"SALIR",grid:0,evt:"e11152_client"};this.Events={e11152_client:["'SALIR'",!0],e13152_client:["ENTER",!0],e14152_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[],[]];this.EvtParms["'SALIR'"]=[[],[]];this.Initialize()});gx.wi(function(){gx.createParentObj(this.iniciocolaveco)})