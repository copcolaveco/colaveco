/*!   GeneXus Java 17_0_7-156546 on December 17, 2021 19:3:52.94
*/
gx.evt.autoSkip=!1;gx.define("gam_wwuserpermissions",!1,function(){var n,t;this.ServerClass="gam_wwuserpermissions";this.PackageName="genexus.security.backend";this.ServerFullClass="genexus.security.backend.gam_wwuserpermissions";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV29UserId=gx.fn.getControlValue("vUSERID");this.AV28SearchFilter=gx.fn.getControlValue("vSEARCHFILTER");this.AV18isOK=gx.fn.getControlValue("vISOK");this.AV22pApplicationId=gx.fn.getIntegerValue("vPAPPLICATIONID",gx.thousandSeparator);this.AV29UserId=gx.fn.getControlValue("vUSERID");this.AV28SearchFilter=gx.fn.getControlValue("vSEARCHFILTER");this.AV29UserId=gx.fn.getControlValue("vUSERID")};this.Validv_Permissionaccesstype=function(){return this.validCliEvt("Validv_Permissionaccesstype",0,function(){try{var n=gx.util.balloon.getNew("vPERMISSIONACCESSTYPE");if(this.AnyError=0,!(gx.text.compare(this.AV24PermissionAccessType,"A")==0||gx.text.compare(this.AV24PermissionAccessType,"D")==0||gx.text.compare(this.AV24PermissionAccessType,"R")==0||gx.text.compare("",this.AV24PermissionAccessType)==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Permission Access Type"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Validv_Boolenfilter=function(){return this.validCliEvt("Validv_Boolenfilter",0,function(){try{var n=gx.util.balloon.getNew("vBOOLENFILTER");if(this.AnyError=0,!(gx.text.compare(this.AV9BoolenFilter,"A")==0||gx.text.compare(this.AV9BoolenFilter,"T")==0||gx.text.compare(this.AV9BoolenFilter,"F")==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Boolen Filter"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Validv_Accesstype=function(){var n=gx.fn.currentGridRowImpl(66);return this.validCliEvt("Validv_Accesstype",66,function(){try{var n=gx.util.balloon.getNew("vACCESSTYPE");if(this.AnyError=0,!(gx.text.compare(this.AV5AccessType,"A")==0||gx.text.compare(this.AV5AccessType,"D")==0||gx.text.compare(this.AV5AccessType,"R")==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Access Type"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Validv_Old_accesstype=function(){var n=gx.fn.currentGridRowImpl(66);return this.validCliEvt("Validv_Old_accesstype",66,function(){try{var n=gx.util.balloon.getNew("vOLD_ACCESSTYPE");if(this.AnyError=0,!(gx.text.compare(this.AV20old_AccessType,"A")==0||gx.text.compare(this.AV20old_AccessType,"D")==0||gx.text.compare(this.AV20old_AccessType,"R")==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("old_Access Type"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e122s1_client=function(){return this.clearMessages(),0==this.AV8ApplicationId?this.addMessage(gx.getMessage("You must select Application.")):this.call("genexus.security.backend.gam_userpermissionselect",[this.AV29UserId,this.AV8ApplicationId],null,["UserId","ApplicationId"]),this.refreshOutputs([{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV29UserId",fld:"vUSERID",pic:""}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e112s1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("FILTERSCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("FILTERSCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("HIDE","Caption",gx.getMessage("HIDE FILTERS")),gx.fn.setCtrlProperty("HIDE","Class","HideFiltersButton"),gx.fn.setCtrlProperty("GRIDCELL","Class","WWGridCell")):(gx.fn.setCtrlProperty("FILTERSCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("HIDE","Caption",gx.getMessage("SHOW FILTERS")),gx.fn.setCtrlProperty("HIDE","Class","ShowFiltersButton"),gx.fn.setCtrlProperty("GRIDCELL","Class","WWGridCellExpanded")),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"},{ctrl:"HIDE",prop:"Caption"},{ctrl:"HIDE",prop:"Class"},{av:'gx.fn.getCtrlProperty("GRIDCELL","Class")',ctrl:"GRIDCELL",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e132s2_client=function(){return this.executeServerEvent("'SAVE'",!1,null,!1,!1)};this.e162s2_client=function(){return this.executeServerEvent("VBTNDLT.CLICK",!0,arguments[0],!1,!1)};this.e172s2_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e182s1_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,64,65,67,68,69,70,71,72,73,74];this.GXLastCtrlId=74;this.GridwwContainer=new gx.grid.grid(this,2,"WbpLvl2",66,"Gridww","Gridww","GridwwContainer",this.CmpContext,this.IsMasterPage,"gam_wwuserpermissions",[],!1,1,!1,!0,0,!1,!1,!1,"",0,"px",0,"px",gx.getMessage("GXM_newrow"),!1,!1,!0,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.GridwwContainer;t.addSingleLineEdit("Name",67,"vNAME",gx.getMessage("Permission name"),"","Name","char",0,"px",120,80,"left",null,[],"Name","Name",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit("Dsc",68,"vDSC",gx.getMessage("Description"),"","Dsc","char",0,"px",254,80,"left",null,[],"Dsc","Dsc",!0,0,!1,!1,"Attribute",1,"WWColumn WWOptionalColumn");t.addComboBox("Accesstype",69,"vACCESSTYPE",gx.getMessage("Permissions options"),"AccessType","char",null,0,!0,!1,0,"px","WWColumn");t.addCheckBox("Inherited",70,"vINHERITED",gx.getMessage("Inherited"),"","Inherited","boolean","true","false",null,!0,!1,0,"px","WWTextActionColumn");t.addSingleLineEdit("Btndlt",71,"vBTNDLT","","","BtnDlt","char",0,"px",20,20,"left","e162s2_client",[],"Btndlt","BtnDlt",!0,0,!1,!1,"TextActionAttribute TextLikeLink",1,"WWTextActionColumn");t.addComboBox("Old_accesstype",72,"vOLD_ACCESSTYPE",gx.getMessage("Permissions options"),"old_AccessType","char",null,0,!1,!1,0,"px","");t.addCheckBox("Old_inherited",73,"vOLD_INHERITED",gx.getMessage("Boolean"),"","old_Inherited","boolean","true","false",null,!1,!1,0,"px","");t.addSingleLineEdit("Id",74,"vID",gx.getMessage("GUID"),"","Id","char",0,"px",40,40,"left",null,[],"Id","Id",!1,0,!1,!1,"Attribute",1,"");this.GridwwContainer.emptyText=gx.getMessage("");this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TABLE2",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TABLE1",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"HIDE",grid:0,evt:"e112s1_client"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"TEXTBLOCK4",format:0,grid:0,ctrltype:"textblock"};n[15]={id:15,fld:"",grid:0};n[16]={id:16,fld:"TABLE8",grid:0};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"BTNBACK",grid:0,evt:"e182s1_client"};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"BTNSAVE",grid:0,evt:"e132s2_client"};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"ADDNEW",grid:0,evt:"e122s1_client"};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"char",len:254,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vFILNAME",gxz:"ZV14FilName",gxold:"OV14FilName",gxvar:"AV14FilName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV14FilName=n)},v2z:function(n){n!==undefined&&(gx.O.ZV14FilName=n)},v2c:function(){gx.fn.setControlValue("vFILNAME",gx.O.AV14FilName,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV14FilName=this.val())},val:function(){return gx.fn.getControlValue("vFILNAME")},nac:gx.falseFn};this.declareDomainHdlr(26,function(){});n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"CELLFILTERS",grid:0};n[29]={id:29,fld:"FILTERSCONTAINER",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"TABLE6",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"TEXTBLOCK2",format:0,grid:0,ctrltype:"textblock"};n[36]={id:36,fld:"",grid:0};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,lvl:0,type:"char",len:1,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Permissionaccesstype,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vPERMISSIONACCESSTYPE",gxz:"ZV24PermissionAccessType",gxold:"OV24PermissionAccessType",gxvar:"AV24PermissionAccessType",ucs:[],op:[39],ip:[39],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV24PermissionAccessType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV24PermissionAccessType=n)},v2c:function(){gx.fn.setComboBoxValue("vPERMISSIONACCESSTYPE",gx.O.AV24PermissionAccessType);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV24PermissionAccessType=this.val())},val:function(){return gx.fn.getControlValue("vPERMISSIONACCESSTYPE")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"TABLE7",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,fld:"",grid:0};n[45]={id:45,fld:"TEXTBLOCK3",format:0,grid:0,ctrltype:"textblock"};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,lvl:0,type:"char",len:1,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Boolenfilter,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vBOOLENFILTER",gxz:"ZV9BoolenFilter",gxold:"OV9BoolenFilter",gxvar:"AV9BoolenFilter",ucs:[],op:[49],ip:[49],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV9BoolenFilter=n)},v2z:function(n){n!==undefined&&(gx.O.ZV9BoolenFilter=n)},v2c:function(){gx.fn.setComboBoxValue("vBOOLENFILTER",gx.O.AV9BoolenFilter);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV9BoolenFilter=this.val())},val:function(){return gx.fn.getControlValue("vBOOLENFILTER")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});n[50]={id:50,fld:"GRIDCELL",grid:0};n[51]={id:51,fld:"GRIDTABLE",grid:0};n[52]={id:52,fld:"",grid:0};n[53]={id:53,fld:"",grid:0};n[54]={id:54,fld:"",grid:0};n[55]={id:55,fld:"",grid:0};n[56]={id:56,lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vGAMUSERNAME",gxz:"ZV31GAMUserName",gxold:"OV31GAMUserName",gxvar:"AV31GAMUserName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV31GAMUserName=n)},v2z:function(n){n!==undefined&&(gx.O.ZV31GAMUserName=n)},v2c:function(){gx.fn.setControlValue("vGAMUSERNAME",gx.O.AV31GAMUserName,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV31GAMUserName=this.val())},val:function(){return gx.fn.getControlValue("vGAMUSERNAME")},nac:gx.falseFn};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,fld:"",grid:0};n[60]={id:60,lvl:0,type:"int",len:12,dec:0,sign:!1,pic:"ZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vAPPLICATIONID",gxz:"ZV8ApplicationId",gxold:"OV8ApplicationId",gxvar:"AV8ApplicationId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV8ApplicationId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV8ApplicationId=gx.num.intval(n))},v2c:function(){gx.fn.setComboBoxValue("vAPPLICATIONID",gx.O.AV8ApplicationId);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV8ApplicationId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vAPPLICATIONID",gx.thousandSeparator)},nac:gx.falseFn};this.declareDomainHdlr(60,function(){});n[61]={id:61,fld:"",grid:0};n[62]={id:62,fld:"",grid:0};n[64]={id:64,fld:"",grid:0};n[65]={id:65,fld:"",grid:0};n[67]={id:67,lvl:2,type:"char",len:120,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vNAME",gxz:"ZV19Name",gxold:"OV19Name",gxvar:"AV19Name",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV19Name=n)},v2z:function(n){n!==undefined&&(gx.O.ZV19Name=n)},v2c:function(n){gx.fn.setGridControlValue("vNAME",n||gx.fn.currentGridRowImpl(66),gx.O.AV19Name,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV19Name=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vNAME",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[68]={id:68,lvl:2,type:"char",len:254,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vDSC",gxz:"ZV11Dsc",gxold:"OV11Dsc",gxvar:"AV11Dsc",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV11Dsc=n)},v2z:function(n){n!==undefined&&(gx.O.ZV11Dsc=n)},v2c:function(n){gx.fn.setGridControlValue("vDSC",n||gx.fn.currentGridRowImpl(66),gx.O.AV11Dsc,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV11Dsc=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vDSC",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[69]={id:69,lvl:2,type:"char",len:1,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:this.Validv_Accesstype,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vACCESSTYPE",gxz:"ZV5AccessType",gxold:"OV5AccessType",gxvar:"AV5AccessType",ucs:[],op:[69],ip:[69],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5AccessType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5AccessType=n)},v2c:function(n){gx.fn.setGridComboBoxValue("vACCESSTYPE",n||gx.fn.currentGridRowImpl(66),gx.O.AV5AccessType);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV5AccessType=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vACCESSTYPE",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[70]={id:70,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vINHERITED",gxz:"ZV17Inherited",gxold:"OV17Inherited",gxvar:"AV17Inherited",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV17Inherited=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV17Inherited=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("vINHERITED",n||gx.fn.currentGridRowImpl(66),gx.O.AV17Inherited,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV17Inherited=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("vINHERITED",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn,values:["true","false"]};n[71]={id:71,lvl:2,type:"char",len:20,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vBTNDLT",gxz:"ZV10BtnDlt",gxold:"OV10BtnDlt",gxvar:"AV10BtnDlt",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV10BtnDlt=n)},v2z:function(n){n!==undefined&&(gx.O.ZV10BtnDlt=n)},v2c:function(n){gx.fn.setGridControlValue("vBTNDLT",n||gx.fn.currentGridRowImpl(66),gx.O.AV10BtnDlt,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV10BtnDlt=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vBTNDLT",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn,evt:"e162s2_client"};n[72]={id:72,lvl:2,type:"char",len:1,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:this.Validv_Old_accesstype,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vOLD_ACCESSTYPE",gxz:"ZV20old_AccessType",gxold:"OV20old_AccessType",gxvar:"AV20old_AccessType",ucs:[],op:[72],ip:[72],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV20old_AccessType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV20old_AccessType=n)},v2c:function(n){gx.fn.setGridComboBoxValue("vOLD_ACCESSTYPE",n||gx.fn.currentGridRowImpl(66),gx.O.AV20old_AccessType);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV20old_AccessType=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vOLD_ACCESSTYPE",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};n[73]={id:73,lvl:2,type:"boolean",len:1,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vOLD_INHERITED",gxz:"ZV21old_Inherited",gxold:"OV21old_Inherited",gxvar:"AV21old_Inherited",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV21old_Inherited=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV21old_Inherited=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("vOLD_INHERITED",n||gx.fn.currentGridRowImpl(66),gx.O.AV21old_Inherited,!0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV21old_Inherited=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("vOLD_INHERITED",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn,values:["true","false"]};n[74]={id:74,lvl:2,type:"char",len:40,dec:0,sign:!1,ro:0,isacc:0,grid:66,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vID",gxz:"ZV16Id",gxold:"OV16Id",gxvar:"AV16Id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV16Id=n)},v2z:function(n){n!==undefined&&(gx.O.ZV16Id=n)},v2c:function(n){gx.fn.setGridControlValue("vID",n||gx.fn.currentGridRowImpl(66),gx.O.AV16Id,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV16Id=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vID",n||gx.fn.currentGridRowImpl(66))},nac:gx.falseFn};this.AV14FilName="";this.ZV14FilName="";this.OV14FilName="";this.AV24PermissionAccessType="";this.ZV24PermissionAccessType="";this.OV24PermissionAccessType="";this.AV9BoolenFilter="";this.ZV9BoolenFilter="";this.OV9BoolenFilter="";this.AV31GAMUserName="";this.ZV31GAMUserName="";this.OV31GAMUserName="";this.AV8ApplicationId=0;this.ZV8ApplicationId=0;this.OV8ApplicationId=0;this.ZV19Name="";this.OV19Name="";this.ZV11Dsc="";this.OV11Dsc="";this.ZV5AccessType="";this.OV5AccessType="";this.ZV17Inherited=!1;this.OV17Inherited=!1;this.ZV10BtnDlt="";this.OV10BtnDlt="";this.ZV20old_AccessType="";this.OV20old_AccessType="";this.ZV21old_Inherited=!1;this.OV21old_Inherited=!1;this.ZV16Id="";this.OV16Id="";this.AV14FilName="";this.AV24PermissionAccessType="";this.AV9BoolenFilter="";this.AV31GAMUserName="";this.AV8ApplicationId=0;this.AV29UserId="";this.AV22pApplicationId=0;this.AV19Name="";this.AV11Dsc="";this.AV5AccessType="";this.AV17Inherited=!1;this.AV10BtnDlt="";this.AV20old_AccessType="";this.AV21old_Inherited=!1;this.AV16Id="";this.AV28SearchFilter="";this.AV18isOK=!1;this.Events={e132s2_client:["'SAVE'",!0],e162s2_client:["VBTNDLT.CLICK",!0],e172s2_client:["ENTER",!0],e182s1_client:["CANCEL",!0],e122s1_client:["'ADDNEW'",!1],e112s1_client:["'HIDE'",!1]};this.EvtParms.REFRESH=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV29UserId",fld:"vUSERID",pic:""},{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV14FilName",fld:"vFILNAME",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV24PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV28SearchFilter",fld:"vSEARCHFILTER",pic:"",hsh:!0}],[]];this.EvtParms.START=[[{av:"AV22pApplicationId",fld:"vPAPPLICATIONID",pic:"ZZZZZZZZZZZ9"}],[{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"}]];this.EvtParms["GRIDWW.LOAD"]=[[{av:"AV29UserId",fld:"vUSERID",pic:""},{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV14FilName",fld:"vFILNAME",pic:""},{av:"AV28SearchFilter",fld:"vSEARCHFILTER",pic:"",hsh:!0},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV24PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""}],[{av:"AV31GAMUserName",fld:"vGAMUSERNAME",pic:""},{av:"AV10BtnDlt",fld:"vBTNDLT",pic:""},{av:"AV16Id",fld:"vID",pic:"",hsh:!0},{av:"AV19Name",fld:"vNAME",pic:""},{av:"AV11Dsc",fld:"vDSC",pic:""},{ctrl:"vACCESSTYPE"},{av:"AV5AccessType",fld:"vACCESSTYPE",pic:""},{av:"AV17Inherited",fld:"vINHERITED",pic:""},{ctrl:"vOLD_ACCESSTYPE"},{av:"AV20old_AccessType",fld:"vOLD_ACCESSTYPE",pic:"",hsh:!0},{av:"AV21old_Inherited",fld:"vOLD_INHERITED",pic:"",hsh:!0}]];this.EvtParms["'ADDNEW'"]=[[{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV29UserId",fld:"vUSERID",pic:""}],[{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV29UserId",fld:"vUSERID",pic:""}]];this.EvtParms["'SAVE'"]=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV29UserId",fld:"vUSERID",pic:""},{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV14FilName",fld:"vFILNAME",pic:""},{av:"AV28SearchFilter",fld:"vSEARCHFILTER",pic:"",hsh:!0},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV24PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV5AccessType",fld:"vACCESSTYPE",grid:66,pic:""},{av:"nRC_GXsfl_66",ctrl:"GRIDWW",grid:66,prop:"GridRC",grid:66},{av:"AV20old_AccessType",fld:"vOLD_ACCESSTYPE",grid:66,pic:"",hsh:!0},{av:"AV17Inherited",fld:"vINHERITED",grid:66,pic:""},{av:"AV21old_Inherited",fld:"vOLD_INHERITED",grid:66,pic:"",hsh:!0},{av:"AV16Id",fld:"vID",grid:66,pic:"",hsh:!0},{av:"AV18isOK",fld:"vISOK",pic:""}],[{av:"AV18isOK",fld:"vISOK",pic:""}]];this.EvtParms["'HIDE'"]=[[{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"},{ctrl:"HIDE",prop:"Caption"},{ctrl:"HIDE",prop:"Class"},{av:'gx.fn.getCtrlProperty("GRIDCELL","Class")',ctrl:"GRIDCELL",prop:"Class"}]];this.EvtParms["VBTNDLT.CLICK"]=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV29UserId",fld:"vUSERID",pic:""},{ctrl:"vAPPLICATIONID"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV14FilName",fld:"vFILNAME",pic:""},{av:"AV28SearchFilter",fld:"vSEARCHFILTER",pic:"",hsh:!0},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV24PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV16Id",fld:"vID",pic:"",hsh:!0}],[{av:"AV18isOK",fld:"vISOK",pic:""}]];this.EvtParms.VALIDV_PERMISSIONACCESSTYPE=[[],[]];this.EvtParms.VALIDV_BOOLENFILTER=[[],[]];this.EvtParms.VALIDV_ACCESSTYPE=[[{ctrl:"vACCESSTYPE"},{av:"AV5AccessType",fld:"vACCESSTYPE",pic:""}],[{ctrl:"vACCESSTYPE"},{av:"AV5AccessType",fld:"vACCESSTYPE",pic:""}]];this.EvtParms.VALIDV_OLD_ACCESSTYPE=[[{ctrl:"vOLD_ACCESSTYPE"},{av:"AV20old_AccessType",fld:"vOLD_ACCESSTYPE",pic:"",hsh:!0}],[{ctrl:"vOLD_ACCESSTYPE"},{av:"AV20old_AccessType",fld:"vOLD_ACCESSTYPE",pic:"",hsh:!0}]];this.setVCMap("AV29UserId","vUSERID",0,"char",40,0);this.setVCMap("AV28SearchFilter","vSEARCHFILTER",0,"char",254,0);this.setVCMap("AV18isOK","vISOK",0,"boolean",4,0);this.setVCMap("AV22pApplicationId","vPAPPLICATIONID",0,"int",12,0);this.setVCMap("AV29UserId","vUSERID",0,"char",40,0);this.setVCMap("AV28SearchFilter","vSEARCHFILTER",0,"char",254,0);this.setVCMap("AV29UserId","vUSERID",0,"char",40,0);this.setVCMap("AV29UserId","vUSERID",0,"char",40,0);this.setVCMap("AV28SearchFilter","vSEARCHFILTER",0,"char",254,0);t.addRefreshingVar({rfrVar:"AV29UserId"});t.addRefreshingVar(this.GXValidFnc[60]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar({rfrVar:"AV28SearchFilter"});t.addRefreshingVar(this.GXValidFnc[39]);t.addRefreshingVar(this.GXValidFnc[49]);t.addRefreshingParm({rfrVar:"AV29UserId"});t.addRefreshingParm(this.GXValidFnc[60]);t.addRefreshingParm(this.GXValidFnc[26]);t.addRefreshingParm({rfrVar:"AV28SearchFilter"});t.addRefreshingParm(this.GXValidFnc[39]);t.addRefreshingParm(this.GXValidFnc[49]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gam_wwuserpermissions)})