gx.evt.autoSkip=!1;gx.define("rwdmasterpage",!1,function(){var n,t;this.ServerClass="rwdmasterpage";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.rwdmasterpage";this.setObjectType("web");this.IsMasterPage=!0;this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.e14041_client=function(){return this.clearMessages(),this.addMessage(this.GPXMENU1_MPAGEContainer.Code),this.refreshOutputs([]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e15042_client=function(){return this.executeServerEvent("ENTER_MPAGE",!0,null,!1,!1)};this.e16042_client=function(){return this.executeServerEvent("CANCEL_MPAGE",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17];this.GXLastCtrlId=17;this.GPXMENU1_MPAGEContainer=gx.uc.getNew(this,12,0,"gpxMenu","GPXMENU1_MPAGEContainer","Gpxmenu1","GPXMENU1_MPAGE");t=this.GPXMENU1_MPAGEContainer;t.setProp("Class","Class","","char");t.setProp("Enabled","Enabled",!0,"boolean");t.addV2CFunction("AV5gpxMenuItems","vGPXMENUITEMS_MPAGE","SetMenu");t.addC2VFunction(function(n){n.ParentObject.AV5gpxMenuItems=n.GetMenu();gx.fn.setControlValue("vGPXMENUITEMS_MPAGE",n.ParentObject.AV5gpxMenuItems)});t.setProp("CollapsedTitle","Collapsedtitle","Main Menu","str");t.setProp("ResizeWidth","Resizewidth","800","str");t.setProp("Code","Code","","str");t.setProp("CollapsedBackColor","Collapsedbackcolor","#999","str");t.setProp("MainBackColor","Mainbackcolor","#aaa","str");t.setProp("SecondaryBackColor","Secondarybackcolor","#bbb","str");t.setProp("FontColor","Fontcolor","black","str");t.setProp("Visible","Visible",!0,"bool");t.setC2ShowFunction(function(n){n.show()});t.addEventHandler("ItemClick",this.e14041_client);this.setUserControl(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"HEADER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"APPLICATIONHEADER",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"CONTENT",grid:0};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"",grid:0};this.AV5gpxMenuItems=[];this.Events={e15042_client:["ENTER_MPAGE",!0],e16042_client:["CANCEL_MPAGE",!0],e14041_client:["GPXMENU1_MPAGE.ITEMCLICK_MPAGE",!1]};this.EvtParms.REFRESH_MPAGE=[[],[]];this.EvtParms["GPXMENU1_MPAGE.ITEMCLICK_MPAGE"]=[[{av:"this.GPXMENU1_MPAGEContainer.Code",ctrl:"GPXMENU1_MPAGE",prop:"Code"}],[]];this.EvtParms.START_MPAGE=[[],[{av:'gx.fn.getCtrlProperty("APPLICATIONHEADER_MPAGE","Caption")',ctrl:"APPLICATIONHEADER_MPAGE",prop:"Caption"},{av:"AV5gpxMenuItems",fld:"vGPXMENUITEMS_MPAGE",pic:""}]];this.Initialize()});gx.wi(function(){gx.createMasterPage(rwdmasterpage)})