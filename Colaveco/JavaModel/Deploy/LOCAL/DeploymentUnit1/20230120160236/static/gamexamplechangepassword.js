gx.evt.autoSkip=!1;gx.define("gamexamplechangepassword",!1,function(){this.ServerClass="gamexamplechangepassword";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.gamexamplechangepassword";this.setObjectType("web");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV7IDP_State=gx.fn.getControlValue("vIDP_STATE")};this.e120h2_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e130h2_client=function(){return this.executeServerEvent("'LOGIN'",!0,null,!1,!1)};this.e150h2_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34];this.GXLastCtrlId=34;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TABLE1",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"TEXTBLOCK1",format:0,grid:0,ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"svchar",len:100,dec:60,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERNAME",gxz:"ZV11UserName",gxold:"OV11UserName",gxvar:"AV11UserName",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV11UserName=n)},v2z:function(n){n!==undefined&&(gx.O.ZV11UserName=n)},v2c:function(){gx.fn.setControlValue("vUSERNAME",gx.O.AV11UserName,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV11UserName=this.val())},val:function(){return gx.fn.getControlValue("vUSERNAME")},nac:gx.falseFn};this.declareDomainHdlr(16,function(){});n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"",grid:0};n[20]={id:20,lvl:0,type:"char",len:50,dec:0,sign:!1,isPwd:!0,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERPASSWORD",gxz:"ZV12UserPassword",gxold:"OV12UserPassword",gxvar:"AV12UserPassword",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV12UserPassword=n)},v2z:function(n){n!==undefined&&(gx.O.ZV12UserPassword=n)},v2c:function(){gx.fn.setControlValue("vUSERPASSWORD",gx.O.AV12UserPassword,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV12UserPassword=this.val())},val:function(){return gx.fn.getControlValue("vUSERPASSWORD")},nac:gx.falseFn};this.declareDomainHdlr(20,function(){});n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"",grid:0};n[24]={id:24,lvl:0,type:"char",len:50,dec:0,sign:!1,isPwd:!0,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERPASSWORDNEW",gxz:"ZV13UserPasswordNew",gxold:"OV13UserPasswordNew",gxvar:"AV13UserPasswordNew",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV13UserPasswordNew=n)},v2z:function(n){n!==undefined&&(gx.O.ZV13UserPasswordNew=n)},v2c:function(){gx.fn.setControlValue("vUSERPASSWORDNEW",gx.O.AV13UserPasswordNew,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV13UserPasswordNew=this.val())},val:function(){return gx.fn.getControlValue("vUSERPASSWORDNEW")},nac:gx.falseFn};this.declareDomainHdlr(24,function(){});n[25]={id:25,fld:"",grid:0};n[26]={id:26,fld:"",grid:0};n[27]={id:27,fld:"",grid:0};n[28]={id:28,lvl:0,type:"char",len:50,dec:0,sign:!1,isPwd:!0,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vUSERPASSWORDNEWCONF",gxz:"ZV14UserPasswordNewConf",gxold:"OV14UserPasswordNewConf",gxvar:"AV14UserPasswordNewConf",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV14UserPasswordNewConf=n)},v2z:function(n){n!==undefined&&(gx.O.ZV14UserPasswordNewConf=n)},v2c:function(){gx.fn.setControlValue("vUSERPASSWORDNEWCONF",gx.O.AV14UserPasswordNewConf,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.AV14UserPasswordNewConf=this.val())},val:function(){return gx.fn.getControlValue("vUSERPASSWORDNEWCONF")},nac:gx.falseFn};this.declareDomainHdlr(28,function(){});n[29]={id:29,fld:"",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"BTNCONFIRM",grid:0,evt:"e120h2_client",std:"ENTER"};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"BTNBACK",format:0,grid:0,evt:"e130h2_client",ctrltype:"textblock"};this.AV11UserName="";this.ZV11UserName="";this.OV11UserName="";this.AV12UserPassword="";this.ZV12UserPassword="";this.OV12UserPassword="";this.AV13UserPasswordNew="";this.ZV13UserPasswordNew="";this.OV13UserPasswordNew="";this.AV14UserPasswordNewConf="";this.ZV14UserPasswordNewConf="";this.OV14UserPasswordNewConf="";this.AV11UserName="";this.AV12UserPassword="";this.AV13UserPasswordNew="";this.AV14UserPasswordNewConf="";this.AV7IDP_State="";this.Events={e120h2_client:["ENTER",!0],e130h2_client:["'LOGIN'",!0],e150h2_client:["CANCEL",!0]};this.EvtParms.REFRESH=[[{av:"AV7IDP_State",fld:"vIDP_STATE",pic:"",hsh:!0}],[]];this.EvtParms.START=[[],[{av:"AV11UserName",fld:"vUSERNAME",pic:""}]];this.EvtParms.ENTER=[[{av:"AV13UserPasswordNew",fld:"vUSERPASSWORDNEW",pic:""},{av:"AV14UserPasswordNewConf",fld:"vUSERPASSWORDNEWCONF",pic:""},{av:"AV12UserPassword",fld:"vUSERPASSWORD",pic:""},{av:"AV7IDP_State",fld:"vIDP_STATE",pic:"",hsh:!0}],[]];this.EvtParms["'LOGIN'"]=[[],[]];this.EnterCtrl=["BTNCONFIRM"];this.setVCMap("AV7IDP_State","vIDP_STATE",0,"char",60,0);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gamexamplechangepassword)})