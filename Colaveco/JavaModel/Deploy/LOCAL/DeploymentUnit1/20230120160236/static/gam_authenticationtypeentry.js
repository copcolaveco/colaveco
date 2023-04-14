/*!   GeneXus Java 17_0_7-156546 on December 17, 2021 18:59:57.51
*/
gx.evt.autoSkip=!1;gx.define("gam_authenticationtypeentry",!1,function(){this.ServerClass="gam_authenticationtypeentry";this.PackageName="genexus.security.backend";this.ServerFullClass="genexus.security.backend.gam_authenticationtypeentry";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.Gx_mode=gx.fn.getControlValue("vMODE");this.AV5Name=gx.fn.getControlValue("vNAME");this.AV7TypeIdDsp=gx.fn.getControlValue("vTYPEIDDSP");this.AV7TypeIdDsp=gx.fn.getControlValue("vTYPEIDDSP");this.AV5Name=gx.fn.getControlValue("vNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.s112_client=function(){gx.text.compare(this.AV6TypeId,"Oauth20")==0?this.createWebComponent("Wcentrypanel","GAM_WCAuthenticationTypeEntryOauth20",[this.Gx_mode,this.AV5Name,this.AV6TypeId]):gx.text.compare(this.AV6TypeId,"Saml20")==0?this.createWebComponent("Wcentrypanel","GAM_WCAuthenticationTypeEntrySaml20",[this.Gx_mode,this.AV5Name,this.AV6TypeId]):gx.text.compare("",this.AV6TypeId)==0||this.createWebComponent("Wcentrypanel","GAM_WCAuthenticationTypeEntryGeneral",[this.Gx_mode,this.AV5Name,this.AV6TypeId])};this.e130f1_client=function(){return this.clearMessages(),this.s112_client(),this.refreshOutputs([{ctrl:"WCENTRYPANEL"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e120f1_client=function(){return this.clearMessages(),this.call("genexus.security.backend.gam_authenticationtypeentry",["DLT",this.AV5Name,this.AV7TypeIdDsp],null,["Mode","Name","TypeIdDsp"]),this.refreshOutputs([{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""},{av:"AV5Name",fld:"vNAME",pic:""}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e110f1_client=function(){return this.clearMessages(),this.call("genexus.security.backend.gam_authenticationtypeentry",["UPD",this.AV5Name,this.AV7TypeIdDsp],null,["Mode","Name","TypeIdDsp"]),this.refreshOutputs([{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""},{av:"AV5Name",fld:"vNAME",pic:""}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e160f2_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e170f2_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,48,49];this.GXLastCtrlId=49;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TABLE3",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TEXTBLOCK1",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"ACTIONSCONTAINER",grid:0};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"TABLEEDIT",grid:0};n[19]={id:19,fld:"",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"IMAGE4",grid:0};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"TEXTBLOCK4",format:0,grid:0,evt:"e110f1_client",ctrltype:"textblock"};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,fld:"TABLEDELETE",grid:0};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"IMAGE2",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"DELETE",format:0,grid:0,evt:"e120f1_client",ctrltype:"textblock"};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"TABLE2",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,fld:"TBLDATA",grid:0};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"TABLE1",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,lvl:0,type:"char",len:30,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vTYPEID",gxz:"ZV6TypeId",gxold:"OV6TypeId",gxvar:"AV6TypeId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(n){n!==undefined&&(gx.O.AV6TypeId=n)},v2z:function(n){n!==undefined&&(gx.O.ZV6TypeId=n)},v2c:function(){gx.fn.setComboBoxValue("vTYPEID",gx.O.AV6TypeId)},c2v:function(){this.val()!==undefined&&(gx.O.AV6TypeId=this.val())},val:function(){return gx.fn.getControlValue("vTYPEID")},nac:gx.falseFn,evt:"e130f1_client"};n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,fld:"",grid:0};this.AV6TypeId="";this.ZV6TypeId="";this.OV6TypeId="";this.AV6TypeId="";this.AV5Name="";this.AV7TypeIdDsp="";this.Gx_mode="";this.Events={e160f2_client:["ENTER",!0],e170f2_client:["CANCEL",!0],e130f1_client:["VTYPEID.CLICK",!1],e120f1_client:["'DELETE'",!1],e110f1_client:["'EDIT'",!1]};this.EvtParms.REFRESH=[[{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0}],[]];this.EvtParms.START=[[{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0},{ctrl:"vTYPEID"},{av:"AV6TypeId",fld:"vTYPEID",pic:""},{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""},{av:"AV5Name",fld:"vNAME",pic:""}],[{av:'gx.fn.getCtrlProperty("TABLEEDIT","Visible")',ctrl:"TABLEEDIT",prop:"Visible"},{av:'gx.fn.getCtrlProperty("TABLEDELETE","Visible")',ctrl:"TABLEDELETE",prop:"Visible"},{av:'gx.fn.getCtrlProperty("ACTIONSCONTAINER","Visible")',ctrl:"ACTIONSCONTAINER",prop:"Visible"},{ctrl:"vTYPEID"},{av:"AV6TypeId",fld:"vTYPEID",pic:""},{ctrl:"WCENTRYPANEL"}]];this.EvtParms["VTYPEID.CLICK"]=[[{ctrl:"vTYPEID"},{av:"AV6TypeId",fld:"vTYPEID",pic:""},{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0},{av:"AV5Name",fld:"vNAME",pic:""}],[{ctrl:"WCENTRYPANEL"}]];this.EvtParms["'DELETE'"]=[[{av:"AV5Name",fld:"vNAME",pic:""},{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""}],[{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""},{av:"AV5Name",fld:"vNAME",pic:""}]];this.EvtParms["'EDIT'"]=[[{av:"AV5Name",fld:"vNAME",pic:""},{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""}],[{av:"AV7TypeIdDsp",fld:"vTYPEIDDSP",pic:""},{av:"AV5Name",fld:"vNAME",pic:""}]];this.setVCMap("Gx_mode","vMODE",0,"char",3,0);this.setVCMap("AV5Name","vNAME",0,"char",254,0);this.setVCMap("AV7TypeIdDsp","vTYPEIDDSP",0,"char",30,0);this.setVCMap("AV7TypeIdDsp","vTYPEIDDSP",0,"char",30,0);this.setVCMap("AV5Name","vNAME",0,"char",254,0);this.setVCMap("Gx_mode","vMODE",0,"char",3,0);this.Initialize();this.setComponent({id:"WCENTRYPANEL",GXClass:null,Prefix:"W0047",lvl:1})});gx.wi(function(){gx.createParentObj(this.gam_authenticationtypeentry)})