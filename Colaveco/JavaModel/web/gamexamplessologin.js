gx.evt.autoSkip=!1;gx.define("gamexamplessologin",!1,function(){this.ServerClass="gamexamplessologin";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.gamexamplessologin";this.setObjectType("web");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e130q2_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e140q2_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[6,18];this.GXLastCtrlId=18;n[6]={id:6,fld:"TABLE1",grid:0};n[18]={id:18,fld:"TBBACK",format:0,grid:0,triggersEvt:"e150q2_client",ctrltype:"textblock"};this.Events={e130q2_client:["ENTER",!0],e140q2_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[],[]];this.EvtParms.START=[[],[{av:'gx.fn.getCtrlProperty("TBBACK","Jsonclick")',ctrl:"TBBACK",prop:"Jsonclick"}]];this.Initialize()});gx.wi(function(){gx.createParentObj(this.gamexamplessologin)})