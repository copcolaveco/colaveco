gx.evt.autoSkip=!1;gx.define("gamexamplelogin",!1,function(){var n,t;this.ServerClass="gamexamplelogin";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.gamexamplelogin";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV21Language=gx.fn.getControlValue("vLANGUAGE");this.AV8AuxUserName=gx.fn.getControlValue("vAUXUSERNAME");this.AV33UserRememberMe=gx.fn.getIntegerValue("vUSERREMEMBERME",",");this.AV14IDP_State=gx.fn.getControlValue("vIDP_STATE");this.AV21Language=gx.fn.getControlValue("vLANGUAGE");this.AV8AuxUserName=gx.fn.getControlValue("vAUXUSERNAME");this.AV33UserRememberMe=gx.fn.getIntegerValue("vUSERREMEMBERME",",");this.AV14IDP_State=gx.fn.getControlValue("vIDP_STATE")};this.Validv_Typeauthtype=function(){var n=gx.fn.currentGridRowImpl(63);return this.validCliEvt("Validv_Typeauthtype",63,function(){try{var n=gx.util.balloon.getNew("vTYPEAUTHTYPE");if(this.AnyError=0,!(gx.text.compare(this.AV29TypeAuthType,"AppleID")==0||gx.text.compare(this.AV29TypeAuthType,"Custom")==0||gx.text.compare(this.AV29TypeAuthType,"ExternalWebService")==0||gx.text.compare(this.AV29TypeAuthType,"Facebook")==0||gx.text.compare(this.AV29TypeAuthType,"GAMLocal")==0||gx.text.compare(this.AV29TypeAuthType,"GAMRemote")==0||gx.text.compare(this.AV29TypeAuthType,"GAMRemoteRest")==0||gx.text.compare(this.AV29TypeAuthType,"Google")==0||gx.text.compare(this.AV29TypeAuthType,"Oauth20")==0||gx.text.compare(this.AV29TypeAuthType,"OTP")==0||gx.text.compare(this.AV29TypeAuthType,"Saml20")==0||gx.text.compare(this.AV29TypeAuthType,"Twitter")==0||gx.text.compare(this.AV29TypeAuthType,"WeChat")==0))try{n.setError("Field Type Auth Type is out of range");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e110g1_client=function(){return this.clearMessages(),this.call("com.colaveco.gamexamplerecoverpasswordstep1",[this.AV14IDP_State],null,["IDP_State"]),this.refreshOutputs([{av:"AV14IDP_State",fld:"vIDP_STATE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e180g1_client=function(){return this.clearMessages(),this.call("com.colaveco.gamexampleregisteruser",[],null,[]),this.refreshOutputs([{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e120g2_client=function(){return this.executeServerEvent("VLOGONTO.CLICK",!0,null,!1,!0)};this.e130g2_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e170g2_client=function(){return this.executeServerEvent("'SELECTAUTHENTICATIONTYPE'",!0,arguments[0],!1,!1)};this.e190g2_client=function(){return this.executeServerEvent("CANCEL",!0,arguments[0],!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,53,55,56,57,58,59,60,61,62,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80];this.GXLastCtrlId=80;this.GridauthtypesContainer=new gx.grid.grid(this,2,"WbpLvl2",63,"Gridauthtypes","Gridauthtypes","GridauthtypesContainer",this.CmpContext,this.IsMasterPage,"gamexamplelogin",[],!0,5,!1,!0,0,!1,!1,!1,"",0,"px",0,"px","New row",!1,!1,!1,null,null,!1,"",!0,[5,5,5,5],!1,0,!1,!1);t=this.GridauthtypesContainer;t.startDiv(64,"Grid1table","0px","0px");t.startDiv(65,"","0px","0px");t.startDiv(66,"","45px","0px");t.startDiv(67,"","0px","0px");t.addLabel();t.addBitmap("&Imageauthtype","vIMAGEAUTHTYPE",68,0,"",0,"","e170g2_client","","","Fixed30","");t.endDiv();t.endDiv();t.endDiv();t.startDiv(69,"","0px","0px");t.startDiv(70,"","0px","0px");t.startDiv(71,"Tableauthtypeinfo","0px","0px");t.startDiv(72,"","0px","0px");t.startDiv(73,"","0px","0px");t.startDiv(74,"","0px","0px");t.addLabel();t.addComboBox("Typeauthtype",75,"vTYPEAUTHTYPE","","TypeAuthType","char",null,0,!0,!1,30,"chr","");t.endDiv();t.endDiv();t.endDiv();t.startDiv(76,"","0px","0px");t.startDiv(77,"","0px","0px");t.startDiv(78,"","0px","0px");t.addLabel();t.addSingleLineEdit("Nameauthtype",79,"vNAMEAUTHTYPE","","","NameAuthType","char",60,"chr",60,60,"left",null,[],"Nameauthtype","NameAuthType",!0,0,!1,!1,"Attribute",1,"");t.endDiv();t.endDiv();t.endDiv();t.endDiv();t.endDiv();t.endDiv();t.endDiv();this.GridauthtypesContainer.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TABLE1",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"TABLELOGIN",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"TEXTBLOCK1",format:0,grid:0,ctrltype:"textblock"};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"CURRENTREPOSITORY",format:0,grid:0,ctrltype:"textblock"};n[19]={id:19,fld:"",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"",grid:0};n[23]={id:23,lvl:0,type:"char",len:60,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLOGONTO",gxz:"ZV23LogOnTo",gxold:"OV23LogOnTo",gxvar:"AV23LogOnTo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV23LogOnTo=n)},v2z:function(n){n!==undefined&&(gx.O.ZV23LogOnTo=n)},v2c:function(){gx.fn.setComboBoxValue("vLOGONTO",gx.O.AV23LogOnTo);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV23LogOnTo=this.val())},val:function(){return gx.fn.getControlValue("vLOGONTO")},nac:gx.falseFn,evt:"e120g2_client"};this.declareDomainHdlr(23,function(){});n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,fld:"",grid:0};n[27]={id:27,lvl:0,type:"svchar",len:100,dec:60,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERNAME",gxz:"ZV31UserName",gxold:"OV31UserName",gxvar:"AV31UserName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV31UserName=n)},v2z:function(n){n!==undefined&&(gx.O.ZV31UserName=n)},v2c:function(){gx.fn.setControlValue("vUSERNAME",gx.O.AV31UserName,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV31UserName=this.val())},val:function(){return gx.fn.getControlValue("vUSERNAME")},nac:gx.falseFn};this.declareDomainHdlr(27,function(){});n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,lvl:0,type:"char",len:50,dec:0,sign:!1,isPwd:!0,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERPASSWORD",gxz:"ZV32UserPassword",gxold:"OV32UserPassword",gxvar:"AV32UserPassword",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV32UserPassword=n)},v2z:function(n){n!==undefined&&(gx.O.ZV32UserPassword=n)},v2c:function(){gx.fn.setControlValue("vUSERPASSWORD",gx.O.AV32UserPassword,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV32UserPassword=this.val())},val:function(){return gx.fn.getControlValue("vUSERPASSWORD")},nac:gx.falseFn};this.declareDomainHdlr(31,function(){});n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vKEEPMELOGGEDIN",gxz:"ZV20KeepMeLoggedIn",gxold:"OV20KeepMeLoggedIn",gxvar:"AV20KeepMeLoggedIn",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.AV20KeepMeLoggedIn=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV20KeepMeLoggedIn=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("vKEEPMELOGGEDIN",gx.O.AV20KeepMeLoggedIn,!0)},c2v:function(){this.val()!==undefined&&(gx.O.AV20KeepMeLoggedIn=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("vKEEPMELOGGEDIN")},nac:gx.falseFn,values:["true","false"]};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vREMEMBERME",gxz:"ZV25RememberMe",gxold:"OV25RememberMe",gxvar:"AV25RememberMe",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.AV25RememberMe=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV25RememberMe=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("vREMEMBERME",gx.O.AV25RememberMe,!0)},c2v:function(){this.val()!==undefined&&(gx.O.AV25RememberMe=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("vREMEMBERME")},nac:gx.falseFn,values:["true","false"]};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,fld:"LOGIN",grid:0,evt:"e130g2_client",std:"ENTER"};n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"TBFORGOTPWD",format:0,grid:0,evt:"e110g1_client",ctrltype:"textblock"};n[48]={id:48,fld:"",grid:0};n[49]={id:49,fld:"",grid:0};n[50]={id:50,fld:"TABLECREATEACCOUNT",grid:0};n[53]={id:53,fld:"TBOR",format:0,grid:0,ctrltype:"textblock"};n[55]={id:55,fld:"TBREGISTER",format:0,grid:0,evt:"e180g1_client",ctrltype:"textblock"};n[56]={id:56,fld:"",grid:0};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"TABLEBUTTONS",grid:0};n[59]={id:59,fld:"",grid:0};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"TBEXTERNALAUTHENTICATION",format:0,grid:0,ctrltype:"textblock"};n[62]={id:62,fld:"",grid:0};n[64]={id:64,fld:"GRID1TABLE",grid:63};n[65]={id:65,fld:"",grid:63};n[66]={id:66,fld:"",grid:63};n[67]={id:67,fld:"",grid:63};n[68]={id:68,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:63,gxgrid:this.GridauthtypesContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vIMAGEAUTHTYPE",gxz:"ZV15ImageAuthType",gxold:"OV15ImageAuthType",gxvar:"AV15ImageAuthType",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV15ImageAuthType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV15ImageAuthType=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vIMAGEAUTHTYPE",n||gx.fn.currentGridRowImpl(63),gx.O.AV15ImageAuthType,gx.O.AV39Imageauthtype_GXI)},c2v:function(n){gx.O.AV39Imageauthtype_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV15ImageAuthType=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vIMAGEAUTHTYPE",n||gx.fn.currentGridRowImpl(63))},val_GXI:function(n){return gx.fn.getGridControlValue("vIMAGEAUTHTYPE_GXI",n||gx.fn.currentGridRowImpl(63))},gxvar_GXI:"AV39Imageauthtype_GXI",nac:gx.falseFn,evt:"e170g2_client"};n[69]={id:69,fld:"",grid:63};n[70]={id:70,fld:"",grid:63};n[71]={id:71,fld:"TABLEAUTHTYPEINFO",grid:63};n[72]={id:72,fld:"",grid:63};n[73]={id:73,fld:"",grid:63};n[74]={id:74,fld:"",grid:63};n[75]={id:75,lvl:2,type:"char",len:30,dec:0,sign:!1,ro:0,isacc:0,grid:63,gxgrid:this.GridauthtypesContainer,fnc:this.Validv_Typeauthtype,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vTYPEAUTHTYPE",gxz:"ZV29TypeAuthType",gxold:"OV29TypeAuthType",gxvar:"AV29TypeAuthType",ucs:[],op:[75],ip:[75],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV29TypeAuthType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV29TypeAuthType=n)},v2c:function(n){gx.fn.setGridComboBoxValue("vTYPEAUTHTYPE",n||gx.fn.currentGridRowImpl(63),gx.O.AV29TypeAuthType);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV29TypeAuthType=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vTYPEAUTHTYPE",n||gx.fn.currentGridRowImpl(63))},nac:gx.falseFn};n[76]={id:76,fld:"",grid:63};n[77]={id:77,fld:"",grid:63};n[78]={id:78,fld:"",grid:63};n[79]={id:79,lvl:2,type:"char",len:60,dec:0,sign:!1,ro:0,isacc:0,grid:63,gxgrid:this.GridauthtypesContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vNAMEAUTHTYPE",gxz:"ZV24NameAuthType",gxold:"OV24NameAuthType",gxvar:"AV24NameAuthType",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.AV24NameAuthType=n)},v2z:function(n){n!==undefined&&(gx.O.ZV24NameAuthType=n)},v2c:function(n){gx.fn.setGridControlValue("vNAMEAUTHTYPE",n||gx.fn.currentGridRowImpl(63),gx.O.AV24NameAuthType,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.AV24NameAuthType=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vNAMEAUTHTYPE",n||gx.fn.currentGridRowImpl(63))},nac:gx.falseFn};n[80]={id:80,fld:"",grid:0};this.AV23LogOnTo="";this.ZV23LogOnTo="";this.OV23LogOnTo="";this.AV31UserName="";this.ZV31UserName="";this.OV31UserName="";this.AV32UserPassword="";this.ZV32UserPassword="";this.OV32UserPassword="";this.AV20KeepMeLoggedIn=!1;this.ZV20KeepMeLoggedIn=!1;this.OV20KeepMeLoggedIn=!1;this.AV25RememberMe=!1;this.ZV25RememberMe=!1;this.OV25RememberMe=!1;this.ZV15ImageAuthType="";this.OV15ImageAuthType="";this.ZV29TypeAuthType="";this.OV29TypeAuthType="";this.ZV24NameAuthType="";this.OV24NameAuthType="";this.AV23LogOnTo="";this.AV31UserName="";this.AV32UserPassword="";this.AV20KeepMeLoggedIn=!1;this.AV25RememberMe=!1;this.AV15ImageAuthType="";this.AV29TypeAuthType="";this.AV24NameAuthType="";this.AV21Language="";this.AV8AuxUserName="";this.AV33UserRememberMe=0;this.AV14IDP_State="";this.Events={e120g2_client:["VLOGONTO.CLICK",!0],e130g2_client:["ENTER",!0],e170g2_client:["'SELECTAUTHENTICATIONTYPE'",!0],e190g2_client:["CANCEL",!0],e110g1_client:["'FORGOTPASSWORD'",!1],e180g1_client:["'REGISTER'",!1]};this.EvtParms.REFRESH=[[{av:"GRIDAUTHTYPES_nFirstRecordOnPage"},{av:"GRIDAUTHTYPES_nEOF"},{av:"AV21Language",fld:"vLANGUAGE",pic:"",hsh:!0},{av:"AV8AuxUserName",fld:"vAUXUSERNAME",pic:"",hsh:!0},{av:"AV33UserRememberMe",fld:"vUSERREMEMBERME",pic:"Z9",hsh:!0},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:'gx.fn.getCtrlProperty("GRIDAUTHTYPES","Visible")',ctrl:"GRIDAUTHTYPES",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TABLEAUTHTYPEINFO","Visible")',ctrl:"TABLEAUTHTYPEINFO",prop:"Visible"},{av:"AV32UserPassword",fld:"vUSERPASSWORD",pic:""},{ctrl:"vLOGONTO"},{av:"AV23LogOnTo",fld:"vLOGONTO",pic:""},{av:"AV31UserName",fld:"vUSERNAME",pic:""},{av:'gx.fn.getCtrlProperty("vKEEPMELOGGEDIN","Visible")',ctrl:"vKEEPMELOGGEDIN",prop:"Visible"},{av:'gx.fn.getCtrlProperty("vREMEMBERME","Visible")',ctrl:"vREMEMBERME",prop:"Visible"},{av:'gx.fn.getCtrlProperty("vUSERPASSWORD","Visible")',ctrl:"vUSERPASSWORD",prop:"Visible"},{ctrl:"LOGIN",prop:"Caption"},{av:'gx.fn.getCtrlProperty("TBFORGOTPWD","Visible")',ctrl:"TBFORGOTPWD",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TABLECREATEACCOUNT","Visible")',ctrl:"TABLECREATEACCOUNT",prop:"Visible"},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms.START=[[{av:"AV26RepositoryGUID",fld:"vREPOSITORYGUID",pic:""},{av:"AV16isConnectionOK",fld:"vISCONNECTIONOK",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:'gx.fn.getCtrlProperty("CURRENTREPOSITORY","Visible")',ctrl:"CURRENTREPOSITORY",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TABLEBUTTONS","Visible")',ctrl:"TABLEBUTTONS",prop:"Visible"},{av:"AV16isConnectionOK",fld:"vISCONNECTIONOK",pic:""},{av:'gx.fn.getCtrlProperty("CURRENTREPOSITORY","Caption")',ctrl:"CURRENTREPOSITORY",prop:"Caption"},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms["GRIDAUTHTYPES.LOAD"]=[[{av:'gx.fn.getCtrlProperty("TABLEBUTTONS","Visible")',ctrl:"TABLEBUTTONS",prop:"Visible"},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:"AV15ImageAuthType",fld:"vIMAGEAUTHTYPE",pic:""},{ctrl:"vTYPEAUTHTYPE"},{av:"AV29TypeAuthType",fld:"vTYPEAUTHTYPE",pic:""},{av:"AV24NameAuthType",fld:"vNAMEAUTHTYPE",pic:"",hsh:!0},{av:'gx.fn.getCtrlProperty("vIMAGEAUTHTYPE","Tooltiptext")',ctrl:"vIMAGEAUTHTYPE",prop:"Tooltiptext"},{av:'gx.fn.getCtrlProperty("TABLEBUTTONS","Visible")',ctrl:"TABLEBUTTONS",prop:"Visible"},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms["VLOGONTO.CLICK"]=[[{av:"AV21Language",fld:"vLANGUAGE",pic:"",hsh:!0},{ctrl:"vLOGONTO"},{av:"AV23LogOnTo",fld:"vLOGONTO",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:'gx.fn.getCtrlProperty("vUSERPASSWORD","Visible")',ctrl:"vUSERPASSWORD",prop:"Visible"},{av:'gx.fn.getCtrlProperty("vUSERPASSWORD","Invitemessage")',ctrl:"vUSERPASSWORD",prop:"Invitemessage"},{ctrl:"LOGIN",prop:"Caption"},{av:'gx.fn.getCtrlProperty("TBFORGOTPWD","Visible")',ctrl:"TBFORGOTPWD",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TBOR","Visible")',ctrl:"TBOR",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TABLECREATEACCOUNT","Visible")',ctrl:"TABLECREATEACCOUNT",prop:"Visible"},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms.ENTER=[[{ctrl:"vLOGONTO"},{av:"AV23LogOnTo",fld:"vLOGONTO",pic:""},{av:"AV31UserName",fld:"vUSERNAME",pic:""},{av:"AV32UserPassword",fld:"vUSERPASSWORD",pic:""},{av:"AV14IDP_State",fld:"vIDP_STATE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:"AV14IDP_State",fld:"vIDP_STATE",pic:""},{av:"AV32UserPassword",fld:"vUSERPASSWORD",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms["'FORGOTPASSWORD'"]=[[{av:"AV14IDP_State",fld:"vIDP_STATE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:"AV14IDP_State",fld:"vIDP_STATE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms["'REGISTER'"]=[[{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms["'SELECTAUTHENTICATIONTYPE'"]=[[{av:"AV24NameAuthType",fld:"vNAMEAUTHTYPE",pic:"",hsh:!0},{av:"AV31UserName",fld:"vUSERNAME",pic:""},{av:"AV32UserPassword",fld:"vUSERPASSWORD",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EvtParms.VALIDV_TYPEAUTHTYPE=[[{ctrl:"vTYPEAUTHTYPE"},{av:"AV29TypeAuthType",fld:"vTYPEAUTHTYPE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}],[{ctrl:"vTYPEAUTHTYPE"},{av:"AV29TypeAuthType",fld:"vTYPEAUTHTYPE",pic:""},{av:"AV20KeepMeLoggedIn",fld:"vKEEPMELOGGEDIN",pic:""},{av:"AV25RememberMe",fld:"vREMEMBERME",pic:""}]];this.EnterCtrl=["LOGIN"];this.setVCMap("AV21Language","vLANGUAGE",0,"char",3,0);this.setVCMap("AV8AuxUserName","vAUXUSERNAME",0,"svchar",100,60);this.setVCMap("AV33UserRememberMe","vUSERREMEMBERME",0,"int",2,0);this.setVCMap("AV14IDP_State","vIDP_STATE",0,"char",60,0);this.setVCMap("AV21Language","vLANGUAGE",0,"char",3,0);this.setVCMap("AV8AuxUserName","vAUXUSERNAME",0,"svchar",100,60);this.setVCMap("AV33UserRememberMe","vUSERREMEMBERME",0,"int",2,0);this.setVCMap("AV14IDP_State","vIDP_STATE",0,"char",60,0);this.setVCMap("AV21Language","vLANGUAGE",0,"char",3,0);this.setVCMap("AV8AuxUserName","vAUXUSERNAME",0,"svchar",100,60);this.setVCMap("AV33UserRememberMe","vUSERREMEMBERME",0,"int",2,0);t.addRefreshingVar({rfrVar:"AV21Language"});t.addRefreshingVar({rfrVar:"AV8AuxUserName"});t.addRefreshingVar({rfrVar:"AV33UserRememberMe"});t.addRefreshingParm({rfrVar:"AV21Language"});t.addRefreshingParm({rfrVar:"AV8AuxUserName"});t.addRefreshingParm({rfrVar:"AV33UserRememberMe"});t.addRefreshingParm(this.GXValidFnc[36]);t.addRefreshingParm(this.GXValidFnc[41]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gamexamplelogin)})