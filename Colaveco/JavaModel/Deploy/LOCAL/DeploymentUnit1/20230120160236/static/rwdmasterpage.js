gx.evt.autoSkip=!1;gx.define("rwdmasterpage",!1,function(){var t,n;this.ServerClass="rwdmasterpage";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.rwdmasterpage";this.setObjectType("web");this.IsMasterPage=!0;this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e14041_client=function(){return this.clearMessages(),this.addMessage(this.GPXMENU1_MPAGEContainer.Code),this.refreshOutputs([]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e15042_client=function(){return this.executeServerEvent("ENTER_MPAGE",!0,null,!1,!1)};this.e16042_client=function(){return this.executeServerEvent("CANCEL_MPAGE",!0,null,!1,!1)};this.GXValidFnc=[];t=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17];this.GXLastCtrlId=17;this.GPXMENU1_MPAGEContainer=gx.uc.getNew(this,12,0,"gpxMenu","GPXMENU1_MPAGEContainer","Gpxmenu1","GPXMENU1_MPAGE");n=this.GPXMENU1_MPAGEContainer;n.setProp("Class","Class","","char");n.setProp("Enabled","Enabled",!0,"boolean");n.addV2CFunction("AV5gpxMenuItems","vGPXMENUITEMS_MPAGE","SetMenu");n.addC2VFunction(function(n){n.ParentObject.AV5gpxMenuItems=n.GetMenu();gx.fn.setControlValue("vGPXMENUITEMS_MPAGE",n.ParentObject.AV5gpxMenuItems)});n.setProp("CollapsedTitle","Collapsedtitle","Main Menu","str");n.setProp("ResizeWidth","Resizewidth","800","str");n.setProp("Code","Code","","str");n.setProp("CollapsedBackColor","Collapsedbackcolor","#999","str");n.setProp("MainBackColor","Mainbackcolor","#aaa","str");n.setProp("SecondaryBackColor","Secondarybackcolor","#bbb","str");n.setProp("FontColor","Fontcolor","black","str");n.setProp("Visible","Visible",!0,"bool");n.setProp("Gx Control Type","Gxcontroltype","","int");n.setC2ShowFunction(function(n){n.show()});n.addEventHandler("ItemClick",this.e14041_client);this.setUserControl(n);t[2]={id:2,fld:"",grid:0};t[3]={id:3,fld:"MAINTABLE",grid:0};t[4]={id:4,fld:"",grid:0};t[5]={id:5,fld:"",grid:0};t[6]={id:6,fld:"HEADER",grid:0};t[7]={id:7,fld:"",grid:0};t[8]={id:8,fld:"",grid:0};t[9]={id:9,fld:"APPLICATIONHEADER",format:0,grid:0,ctrltype:"textblock"};t[10]={id:10,fld:"",grid:0};t[11]={id:11,fld:"",grid:0};t[13]={id:13,fld:"",grid:0};t[14]={id:14,fld:"",grid:0};t[15]={id:15,fld:"CONTENT",grid:0};t[16]={id:16,fld:"",grid:0};t[17]={id:17,fld:"",grid:0};this.AV5gpxMenuItems=[];this.Events={e15042_client:["ENTER_MPAGE",!0],e16042_client:["CANCEL_MPAGE",!0],e14041_client:["GPXMENU1_MPAGE.ITEMCLICK_MPAGE",!1]};this.EvtParms.REFRESH_MPAGE=[[],[]];this.EvtParms["GPXMENU1_MPAGE.ITEMCLICK_MPAGE"]=[[{av:"this.GPXMENU1_MPAGEContainer.Code",ctrl:"GPXMENU1_MPAGE",prop:"Code"}],[]];this.EvtParms.START_MPAGE=[[],[{av:'gx.fn.getCtrlProperty("APPLICATIONHEADER_MPAGE","Caption")',ctrl:"APPLICATIONHEADER_MPAGE",prop:"Caption"},{av:"AV5gpxMenuItems",fld:"vGPXMENUITEMS_MPAGE",pic:""}]];this.Initialize()});gx.wi(function(){gx.createMasterPage(rwdmasterpage)})