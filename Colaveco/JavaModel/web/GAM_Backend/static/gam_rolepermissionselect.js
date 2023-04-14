/*!   GeneXus Java 17_0_7-156546 on December 17, 2021 19:2:24.63
*/
gx.evt.autoSkip=!1;gx.define("gam_rolepermissionselect",!1,function(){var n,t;this.ServerClass="gam_rolepermissionselect";this.PackageName="genexus.security.backend";this.ServerFullClass="genexus.security.backend.gam_rolepermissionselect";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV24RoleId=gx.fn.getIntegerValue("vROLEID",gx.thousandSeparator);this.AV8ApplicationId=gx.fn.getIntegerValue("vAPPLICATIONID",gx.thousandSeparator);this.AV11CurrentPage=gx.fn.getIntegerValue("vCURRENTPAGE",gx.thousandSeparator);this.AV17isOK=gx.fn.getControlValue("vISOK");this.AV24RoleId=gx.fn.getIntegerValue("vROLEID",gx.thousandSeparator);this.AV8ApplicationId=gx.fn.getIntegerValue("vAPPLICATIONID",gx.thousandSeparator);this.AV11CurrentPage=gx.fn.getIntegerValue("vCURRENTPAGE",gx.thousandSeparator);this.AV11CurrentPage=gx.fn.getIntegerValue("vCURRENTPAGE",gx.thousandSeparator)};this.Validv_Permissionaccesstype=function(){return this.validCliEvt("Validv_Permissionaccesstype",0,function(){try{var n=gx.util.balloon.getNew("vPERMISSIONACCESSTYPE");if(this.AnyError=0,!(gx.text.compare(this.AV20PermissionAccessType,"A")==0||gx.text.compare(this.AV20PermissionAccessType,"D")==0||gx.text.compare(this.AV20PermissionAccessType,"R")==0||gx.text.compare("",this.AV20PermissionAccessType)==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Permission Access Type"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Validv_Boolenfilter=function(){return this.validCliEvt("Validv_Boolenfilter",0,function(){try{var n=gx.util.balloon.getNew("vBOOLENFILTER");if(this.AnyError=0,!(gx.text.compare(this.AV9BoolenFilter,"A")==0||gx.text.compare(this.AV9BoolenFilter,"T")==0||gx.text.compare(this.AV9BoolenFilter,"F")==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Boolen Filter"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Validv_Access=function(){var n=gx.fn.currentGridRowImpl(71);return this.validCliEvt("Validv_Access",71,function(){try{var n=gx.util.balloon.getNew("vACCESS");if(this.AnyError=0,!(gx.text.compare(this.AV6Access,"A")==0||gx.text.compare(this.AV6Access,"D")==0||gx.text.compare(this.AV6Access,"R")==0))try{n.setError(gx.text.format(gx.getMessage("GXSPC_OutOfRange"),gx.getMessage("Access"),"","","","","","","",""));this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e111g1_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("FILTERSCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("FILTERSCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("HIDE","Caption",gx.getMessage("HIDE FILTERS")),gx.fn.setCtrlProperty("HIDE","Class","HideFiltersButton"),gx.fn.setCtrlProperty("GRIDCELL","Class","WWGridCell")):(gx.fn.setCtrlProperty("FILTERSCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("HIDE","Caption",gx.getMessage("SHOW FILTERS")),gx.fn.setCtrlProperty("HIDE","Class","ShowFiltersButton"),gx.fn.setCtrlProperty("GRIDCELL","Class","WWGridCellExpanded")),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"},{ctrl:"HIDE",prop:"Caption"},{ctrl:"HIDE",prop:"Class"},{av:'gx.fn.getCtrlProperty("GRIDCELL","Class")',ctrl:"GRIDCELL",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e181g2_client=function(){return this.clearMessages(),this.call("genexus.security.backend.gam_apppermissionentry",["DSP",this.AV8ApplicationId,this.AV16Id],null,["Mode","ApplicationId","GUID"]),this.refreshOutputs([{av:"AV16Id",fld:"vID",pic:""},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e121g1_client=function(){return this.clearMessages(),this.AV11CurrentPage=gx.num.trunc(1,0),gx.fn.setCtrlProperty("TBFIRST","Class","SelectedPagingText"),gx.fn.setCtrlProperty("TBPREV","Class","SelectedPagingText"),gx.fn.setCtrlProperty("TBFIRST","Enabled",!1),gx.fn.setCtrlProperty("TBPREV","Enabled",!1),this.refreshOutputs([{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]),this.refreshGrid("Gridww"),this.refreshOutputs([{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e131g1_client=function(){return this.clearMessages(),this.AV11CurrentPage>1&&(this.AV11CurrentPage=gx.num.trunc(this.AV11CurrentPage-1,0)),this.AV11CurrentPage==1&&(gx.fn.setCtrlProperty("TBFIRST","Class","SelectedPagingText"),gx.fn.setCtrlProperty("TBPREV","Class","SelectedPagingText"),gx.fn.setCtrlProperty("TBFIRST","Enabled",!1),gx.fn.setCtrlProperty("TBPREV","Enabled",!1)),this.refreshOutputs([{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]),this.refreshGrid("Gridww"),this.refreshOutputs([{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e141g1_client=function(){return this.clearMessages(),this.AV11CurrentPage==1&&(gx.fn.setCtrlProperty("TBFIRST","Class","PagingText"),gx.fn.setCtrlProperty("TBPREV","Class","PagingText"),gx.fn.setCtrlProperty("TBFIRST","Enabled",!0),gx.fn.setCtrlProperty("TBPREV","Enabled",!0)),this.AV11CurrentPage=gx.num.trunc(this.AV11CurrentPage+1,0),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}]),this.refreshGrid("Gridww"),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e151g2_client=function(){return this.executeServerEvent("'ADDSELECTED'",!1,null,!1,!1)};this.e191g2_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e201g1_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,69,70,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91];this.GXLastCtrlId=91;this.GridwwContainer=new gx.grid.grid(this,2,"WbpLvl2",71,"Gridww","Gridww","GridwwContainer",this.CmpContext,this.IsMasterPage,"gam_rolepermissionselect",[],!1,1,!1,!0,0,!1,!1,!1,"",0,"px",0,"px",gx.getMessage("GXM_newrow"),!1,!1,!0,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.GridwwContainer;t.addCheckBox("Select",72,"vSELECT",gx.getMessage("Select"),"","Select","boolean","true","false",null,!0,!1,0,"px","WWActionColumn");t.addSingleLineEdit("Name",73,"vNAME",gx.getMessage("Permission name"),"","Name","char",0,"px",254,80,"left","e181g2_client",[],"Name","Name",!0,0,!1,!1,"Attribute",1,"WWColumn");t.addSingleLineEdit("Dsc",74,"vDSC",gx.getMessage("Description"),"","Dsc","char",0,"px",254,80,"left",null,[],"Dsc","Dsc",!0,0,!1,!1,"Attribute",1,"WWColumn WWOptionalColumn");t.addComboBox("Access",75,"vACCESS",gx.getMessage("Permissions options"),"Access","char",null,0,!0,!1,0,"px","WWColumn");t.addSingleLineEdit("Appid",76,"vAPPID",gx.getMessage("Key Numeric Long"),"","AppId","int",0,"px",12,12,"right",null,[],"Appid","AppId",!1,0,!1,!1,"Attribute",1,"");t.addSingleLineEdit("Id",77,"vID",gx.getMessage("GUID"),"","Id","char",0,"px",40,40,"left",null,[],"Id","Id",!1,0,!1,!1,"Attribute",1,"");this.GridwwContainer.emptyText=gx.getMessage("");this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TABLE2",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TABLE7",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"HIDE",grid:0,evt:"e111g1_client"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"TEXTBLOCK3",format:0,grid:0,ctrltype:"textblock"};n[15]={id:15,fld:"",grid:0};n[16]={id:16,fld:"TABLE3",grid:0};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"BACK",grid:0,evt:"e201g1_client"};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"ADDSELECTED",grid:0,evt:"e151g2_client"};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"",grid:0};n[24]={id:24,lvl:0,type:"svchar",len:100,dec:60,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vSEARCH",gxz:"ZV25Search",gxold:"OV25Search",gxvar:"AV25Search",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV25Search=n)},v2z:function(n){n!==undefined&&(gx.O.ZV25Search=n)},v2c:function(){gx.fn.setControlValue("vSEARCH",gx.O.AV25Search,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV25Search=this.val())},val:function(){return gx.fn.getControlValue("vSEARCH")},nac:gx.falseFn};this.declareDomainHdlr(24,function(){});n[25]={id:25,fld:"",grid:0};n[26]={id:26,fld:"CELLFILTERS",grid:0};n[27]={id:27,fld:"FILTERSCONTAINER",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"",grid:0};n[30]={id:30,fld:"TABLE8",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,lvl:0,type:"svchar",len:100,dec:60,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vSEARCHFILTER",gxz:"ZV26SearchFilter",gxold:"OV26SearchFilter",gxvar:"AV26SearchFilter",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV26SearchFilter=n)},v2z:function(n){n!==undefined&&(gx.O.ZV26SearchFilter=n)},v2c:function(){gx.fn.setControlValue("vSEARCHFILTER",gx.O.AV26SearchFilter,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV26SearchFilter=this.val())},val:function(){return gx.fn.getControlValue("vSEARCHFILTER")},nac:gx.falseFn};this.declareDomainHdlr(34,function(){});n[35]={id:35,fld:"",grid:0};n[36]={id:36,fld:"",grid:0};n[37]={id:37,fld:"TABLE4",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"",grid:0};n[40]={id:40,fld:"TEXTBLOCK1",format:0,grid:0,ctrltype:"textblock"};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,lvl:0,type:"char",len:1,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Permissionaccesstype,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vPERMISSIONACCESSTYPE",gxz:"ZV20PermissionAccessType",gxold:"OV20PermissionAccessType",gxvar:"AV20PermissionAccessType",ucs:[],op:[44],ip:[44],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV20PermissionAccessType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV20PermissionAccessType=n)},v2c:function(){gx.fn.setComboBoxValue("vPERMISSIONACCESSTYPE",gx.O.AV20PermissionAccessType);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV20PermissionAccessType=this.val())},val:function(){return gx.fn.getControlValue("vPERMISSIONACCESSTYPE")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"TABLE5",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,fld:"",grid:0};n[50]={id:50,fld:"TEXTBLOCK2",format:0,grid:0,ctrltype:"textblock"};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"",grid:0};n[53]={id:53,fld:"",grid:0};n[54]={id:54,lvl:0,type:"char",len:1,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Boolenfilter,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vBOOLENFILTER",gxz:"ZV9BoolenFilter",gxold:"OV9BoolenFilter",gxvar:"AV9BoolenFilter",ucs:[],op:[54],ip:[54],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV9BoolenFilter=n)},v2z:function(n){n!==undefined&&(gx.O.ZV9BoolenFilter=n)},v2c:function(){gx.fn.setComboBoxValue("vBOOLENFILTER",gx.O.AV9BoolenFilter);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV9BoolenFilter=this.val())},val:function(){return gx.fn.getControlValue("vBOOLENFILTER")},nac:gx.falseFn};this.declareDomainHdlr(54,function(){});n[55]={id:55,fld:"GRIDCELL",grid:0};n[56]={id:56,fld:"GRIDTABLE",grid:0};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,fld:"",grid:0};n[60]={id:60,fld:"",grid:0};n[61]={id:61,lvl:0,type:"char",len:254,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CTLNAME",gxz:"ZV30GXV1",gxold:"OV30GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.GXV1=n)},v2z:function(n){n!==undefined&&(gx.O.ZV30GXV1=n)},v2c:function(){gx.fn.setControlValue("CTLNAME",gx.O.GXV1,0)},c2v:function(){this.val()!==undefined&&(gx.O.GXV1=this.val())},val:function(){return gx.fn.getControlValue("CTLNAME")},nac:gx.falseFn};n[62]={id:62,fld:"",grid:0};n[63]={id:63,fld:"",grid:0};n[64]={id:64,fld:"",grid:0};n[65]={id:65,lvl:0,type:"char",len:254,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CTLNAME2",gxz:"ZV31GXV2",gxold:"OV31GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.GXV2=n)},v2z:function(n){n!==undefined&&(gx.O.ZV31GXV2=n)},v2c:function(){gx.fn.setControlValue("CTLNAME2",gx.O.GXV2,0)},c2v:function(){this.val()!==undefined&&(gx.O.GXV2=this.val())},val:function(){return gx.fn.getControlValue("CTLNAME2")},nac:gx.falseFn};n[66]={id:66,fld:"",grid:0};n[67]={id:67,fld:"",grid:0};n[69]={id:69,fld:"",grid:0};n[70]={id:70,fld:"",grid:0};n[72]={id:72,lvl:2,type:"boolean",len:4,dec:0,sign:!1,ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vSELECT",gxz:"ZV27Select",gxold:"OV27Select",gxvar:"AV27Select",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV27Select=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV27Select=gx.lang.booleanValue(n))},v2c:function(n){gx.fn.setGridCheckBoxValue("vSELECT",n||gx.fn.currentGridRowImpl(71),gx.O.AV27Select,!0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV27Select=gx.lang.booleanValue(this.val(n)))},val:function(n){return gx.fn.getGridControlValue("vSELECT",n||gx.fn.currentGridRowImpl(71))},nac:gx.falseFn,values:["true","false"]};n[73]={id:73,lvl:2,type:"char",len:254,dec:0,sign:!1,ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vNAME",gxz:"ZV18Name",gxold:"OV18Name",gxvar:"AV18Name",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV18Name=n)},v2z:function(n){n!==undefined&&(gx.O.ZV18Name=n)},v2c:function(n){gx.fn.setGridControlValue("vNAME",n||gx.fn.currentGridRowImpl(71),gx.O.AV18Name,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV18Name=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vNAME",n||gx.fn.currentGridRowImpl(71))},nac:gx.falseFn,evt:"e181g2_client"};n[74]={id:74,lvl:2,type:"char",len:254,dec:0,sign:!1,ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vDSC",gxz:"ZV12Dsc",gxold:"OV12Dsc",gxvar:"AV12Dsc",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV12Dsc=n)},v2z:function(n){n!==undefined&&(gx.O.ZV12Dsc=n)},v2c:function(n){gx.fn.setGridControlValue("vDSC",n||gx.fn.currentGridRowImpl(71),gx.O.AV12Dsc,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV12Dsc=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vDSC",n||gx.fn.currentGridRowImpl(71))},nac:gx.falseFn};n[75]={id:75,lvl:2,type:"char",len:1,dec:0,sign:!1,ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:this.Validv_Access,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vACCESS",gxz:"ZV6Access",gxold:"OV6Access",gxvar:"AV6Access",ucs:[],op:[75],ip:[75],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV6Access=n)},v2z:function(n){n!==undefined&&(gx.O.ZV6Access=n)},v2c:function(n){gx.fn.setGridComboBoxValue("vACCESS",n||gx.fn.currentGridRowImpl(71),gx.O.AV6Access);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV6Access=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vACCESS",n||gx.fn.currentGridRowImpl(71))},nac:gx.falseFn};n[76]={id:76,lvl:2,type:"int",len:12,dec:0,sign:!1,pic:"ZZZZZZZZZZZ9",ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vAPPID",gxz:"ZV7AppId",gxold:"OV7AppId",gxvar:"AV7AppId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV7AppId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7AppId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("vAPPID",n||gx.fn.currentGridRowImpl(71),gx.O.AV7AppId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV7AppId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("vAPPID",n||gx.fn.currentGridRowImpl(71),gx.thousandSeparator)},nac:gx.falseFn};n[77]={id:77,lvl:2,type:"char",len:40,dec:0,sign:!1,ro:0,isacc:0,grid:71,gxgrid:this.GridwwContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vID",gxz:"ZV16Id",gxold:"OV16Id",gxvar:"AV16Id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV16Id=n)},v2z:function(n){n!==undefined&&(gx.O.ZV16Id=n)},v2c:function(n){gx.fn.setGridControlValue("vID",n||gx.fn.currentGridRowImpl(71),gx.O.AV16Id,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV16Id=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vID",n||gx.fn.currentGridRowImpl(71))},nac:gx.falseFn};n[78]={id:78,fld:"",grid:0};n[79]={id:79,fld:"",grid:0};n[80]={id:80,fld:"TABLE1",grid:0};n[81]={id:81,fld:"",grid:0};n[82]={id:82,fld:"",grid:0};n[83]={id:83,fld:"TBFIRST",format:0,grid:0,evt:"e121g1_client",ctrltype:"textblock"};n[84]={id:84,fld:"",grid:0};n[85]={id:85,fld:"TB1",format:0,grid:0,ctrltype:"textblock"};n[86]={id:86,fld:"",grid:0};n[87]={id:87,fld:"TBPREV",format:0,grid:0,evt:"e131g1_client",ctrltype:"textblock"};n[88]={id:88,fld:"",grid:0};n[89]={id:89,fld:"TB2",format:0,grid:0,ctrltype:"textblock"};n[90]={id:90,fld:"",grid:0};n[91]={id:91,fld:"TBNEXT",format:0,grid:0,evt:"e141g1_client",ctrltype:"textblock"};this.AV25Search="";this.ZV25Search="";this.OV25Search="";this.AV26SearchFilter="";this.ZV26SearchFilter="";this.OV26SearchFilter="";this.AV20PermissionAccessType="";this.ZV20PermissionAccessType="";this.OV20PermissionAccessType="";this.AV9BoolenFilter="";this.ZV9BoolenFilter="";this.OV9BoolenFilter="";this.GXV1="";this.ZV30GXV1="";this.OV30GXV1="";this.GXV2="";this.ZV31GXV2="";this.OV31GXV2="";this.ZV27Select=!1;this.OV27Select=!1;this.ZV18Name="";this.OV18Name="";this.ZV12Dsc="";this.OV12Dsc="";this.ZV6Access="";this.OV6Access="";this.ZV7AppId=0;this.OV7AppId=0;this.ZV16Id="";this.OV16Id="";this.AV25Search="";this.AV26SearchFilter="";this.AV20PermissionAccessType="";this.AV9BoolenFilter="";this.GXV1="";this.GXV2="";this.AV24RoleId=0;this.AV8ApplicationId=0;this.AV27Select=!1;this.AV18Name="";this.AV12Dsc="";this.AV6Access="";this.AV7AppId=0;this.AV16Id="";this.AV11CurrentPage=0;this.AV17isOK=!1;this.Events={e151g2_client:["'ADDSELECTED'",!0],e191g2_client:["ENTER",!0],e201g1_client:["CANCEL",!0],e111g1_client:["'HIDE'",!1],e181g2_client:["VNAME.CLICK",!1],e121g1_client:["'FIRST'",!1],e131g1_client:["'PREVIOUS'",!1],e141g1_client:["'NEXT'",!1]};this.EvtParms.REFRESH=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV25Search",fld:"vSEARCH",pic:""},{av:"AV26SearchFilter",fld:"vSEARCHFILTER",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV20PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}],[]];this.EvtParms.START=[[{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"}],[{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}]];this.EvtParms["GRIDWW.LOAD"]=[[{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV25Search",fld:"vSEARCH",pic:""},{av:"AV26SearchFilter",fld:"vSEARCHFILTER",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV20PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}],[{av:"AV16Id",fld:"vID",pic:""},{av:"AV18Name",fld:"vNAME",pic:""},{av:"AV12Dsc",fld:"vDSC",pic:""},{av:'gx.fn.getCtrlProperty("TBNEXT","Class")',ctrl:"TBNEXT",prop:"Class"}]];this.EvtParms["'ADDSELECTED'"]=[[{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV27Select",fld:"vSELECT",grid:71,pic:""},{av:"GRIDWW_nFirstRecordOnPage"},{av:"nRC_GXsfl_71",ctrl:"GRIDWW",grid:71,prop:"GridRC",grid:71},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV16Id",fld:"vID",grid:71,pic:""},{av:"AV6Access",fld:"vACCESS",grid:71,pic:""},{av:"AV17isOK",fld:"vISOK",pic:""}],[{av:"AV17isOK",fld:"vISOK",pic:""},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"}]];this.EvtParms["'HIDE'"]=[[{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("FILTERSCONTAINER","Class")',ctrl:"FILTERSCONTAINER",prop:"Class"},{ctrl:"HIDE",prop:"Caption"},{ctrl:"HIDE",prop:"Class"},{av:'gx.fn.getCtrlProperty("GRIDCELL","Class")',ctrl:"GRIDCELL",prop:"Class"}]];this.EvtParms["VNAME.CLICK"]=[[{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV16Id",fld:"vID",pic:""}],[{av:"AV16Id",fld:"vID",pic:""},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"}]];this.EvtParms["'FIRST'"]=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV25Search",fld:"vSEARCH",pic:""},{av:"AV26SearchFilter",fld:"vSEARCHFILTER",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV20PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}],[{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]];this.EvtParms["'PREVIOUS'"]=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV25Search",fld:"vSEARCH",pic:""},{av:"AV26SearchFilter",fld:"vSEARCHFILTER",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV20PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}],[{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"},{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"}]];this.EvtParms["'NEXT'"]=[[{av:"GRIDWW_nFirstRecordOnPage"},{av:"GRIDWW_nEOF"},{av:"AV24RoleId",fld:"vROLEID",pic:"ZZZZZZZZZZZ9"},{av:"AV8ApplicationId",fld:"vAPPLICATIONID",pic:"ZZZZZZZZZZZ9"},{av:"AV25Search",fld:"vSEARCH",pic:""},{av:"AV26SearchFilter",fld:"vSEARCHFILTER",pic:""},{ctrl:"vPERMISSIONACCESSTYPE"},{av:"AV20PermissionAccessType",fld:"vPERMISSIONACCESSTYPE",pic:""},{ctrl:"vBOOLENFILTER"},{av:"AV9BoolenFilter",fld:"vBOOLENFILTER",pic:""},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}],[{av:'gx.fn.getCtrlProperty("TBFIRST","Class")',ctrl:"TBFIRST",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBPREV","Class")',ctrl:"TBPREV",prop:"Class"},{av:'gx.fn.getCtrlProperty("TBFIRST","Enabled")',ctrl:"TBFIRST",prop:"Enabled"},{av:'gx.fn.getCtrlProperty("TBPREV","Enabled")',ctrl:"TBPREV",prop:"Enabled"},{av:"AV11CurrentPage",fld:"vCURRENTPAGE",pic:"ZZZ9"}]];this.EvtParms.VALIDV_PERMISSIONACCESSTYPE=[[],[]];this.EvtParms.VALIDV_BOOLENFILTER=[[],[]];this.EvtParms.VALIDV_ACCESS=[[{ctrl:"vACCESS"},{av:"AV6Access",fld:"vACCESS",pic:""}],[{ctrl:"vACCESS"},{av:"AV6Access",fld:"vACCESS",pic:""}]];this.setVCMap("AV24RoleId","vROLEID",0,"int",12,0);this.setVCMap("AV8ApplicationId","vAPPLICATIONID",0,"int",12,0);this.setVCMap("AV11CurrentPage","vCURRENTPAGE",0,"int",4,0);this.setVCMap("AV17isOK","vISOK",0,"boolean",4,0);this.setVCMap("AV24RoleId","vROLEID",0,"int",12,0);this.setVCMap("AV8ApplicationId","vAPPLICATIONID",0,"int",12,0);this.setVCMap("AV11CurrentPage","vCURRENTPAGE",0,"int",4,0);this.setVCMap("AV11CurrentPage","vCURRENTPAGE",0,"int",4,0);this.setVCMap("AV24RoleId","vROLEID",0,"int",12,0);this.setVCMap("AV8ApplicationId","vAPPLICATIONID",0,"int",12,0);this.setVCMap("AV11CurrentPage","vCURRENTPAGE",0,"int",4,0);t.addRefreshingVar({rfrVar:"AV24RoleId"});t.addRefreshingVar({rfrVar:"AV8ApplicationId"});t.addRefreshingVar(this.GXValidFnc[24]);t.addRefreshingVar(this.GXValidFnc[34]);t.addRefreshingVar(this.GXValidFnc[44]);t.addRefreshingVar(this.GXValidFnc[54]);t.addRefreshingVar({rfrVar:"AV11CurrentPage"});t.addRefreshingParm({rfrVar:"AV24RoleId"});t.addRefreshingParm({rfrVar:"AV8ApplicationId"});t.addRefreshingParm(this.GXValidFnc[24]);t.addRefreshingParm(this.GXValidFnc[34]);t.addRefreshingParm(this.GXValidFnc[44]);t.addRefreshingParm(this.GXValidFnc[54]);t.addRefreshingParm({rfrVar:"AV11CurrentPage"});this.addBCProperty("Gamapplication",["Name"],this.GXValidFnc[61],"AV5GAMApplication");this.addBCProperty("Gamrole",["Name"],this.GXValidFnc[65],"AV15GAMRole");this.Initialize()});gx.wi(function(){gx.createParentObj(this.gam_rolepermissionselect)})