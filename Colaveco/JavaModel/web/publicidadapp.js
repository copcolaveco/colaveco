gx.evt.autoSkip=!1;gx.define("publicidadapp",!1,function(){this.ServerClass="publicidadapp";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.publicidadapp";this.setObjectType("trn");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){this.AV7PublicidadId=gx.fn.getIntegerValue("vPUBLICIDADID",",");this.A40000PublicidadImagen_GXI=gx.fn.getControlValue("PUBLICIDADIMAGEN_GXI");this.AV11Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE");this.AV9TrnContext=gx.fn.getControlValue("vTRNCONTEXT")};this.Valid_Publicidadid=function(){return this.validCliEvt("Valid_Publicidadid",0,function(){try{var n=gx.util.balloon.getNew("PUBLICIDADID");this.AnyError=0}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e12082_client=function(){return this.executeServerEvent("AFTER TRN",!0,null,!1,!1)};this.e13088_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e14088_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83];this.GXLastCtrlId=83;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TITLECONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TITLE",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"FORMCONTAINER",grid:0};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"TOOLBARCELL",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"BTN_FIRST",grid:0,evt:"e15088_client",std:"FIRST"};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"BTN_PREVIOUS",grid:0,evt:"e16088_client",std:"PREVIOUS"};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"BTN_NEXT",grid:0,evt:"e17088_client",std:"NEXT"};n[26]={id:26,fld:"",grid:0};n[27]={id:27,fld:"BTN_LAST",grid:0,evt:"e18088_client",std:"LAST"};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"BTN_SELECT",grid:0,evt:"e19088_client",std:"SELECT"};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Publicidadid,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADID",gxz:"Z183PublicidadId",gxold:"O183PublicidadId",gxvar:"A183PublicidadId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A183PublicidadId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z183PublicidadId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("PUBLICIDADID",gx.O.A183PublicidadId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.A183PublicidadId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("PUBLICIDADID",",")},nac:function(){return!(0==this.AV7PublicidadId)}};this.declareDomainHdlr(34,function(){});n[35]={id:35,fld:"",grid:0};n[36]={id:36,fld:"",grid:0};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,lvl:0,type:"char",len:256,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADTITULO",gxz:"Z184PublicidadTitulo",gxold:"O184PublicidadTitulo",gxvar:"A184PublicidadTitulo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A184PublicidadTitulo=n)},v2z:function(n){n!==undefined&&(gx.O.Z184PublicidadTitulo=n)},v2c:function(){gx.fn.setControlValue("PUBLICIDADTITULO",gx.O.A184PublicidadTitulo,0)},c2v:function(){this.val()!==undefined&&(gx.O.A184PublicidadTitulo=this.val())},val:function(){return gx.fn.getControlValue("PUBLICIDADTITULO")},nac:gx.falseFn};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,lvl:0,type:"char",len:256,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADSUBTITULO",gxz:"Z185PublicidadSubTitulo",gxold:"O185PublicidadSubTitulo",gxvar:"A185PublicidadSubTitulo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A185PublicidadSubTitulo=n)},v2z:function(n){n!==undefined&&(gx.O.Z185PublicidadSubTitulo=n)},v2c:function(){gx.fn.setControlValue("PUBLICIDADSUBTITULO",gx.O.A185PublicidadSubTitulo,0)},c2v:function(){this.val()!==undefined&&(gx.O.A185PublicidadSubTitulo=this.val())},val:function(){return gx.fn.getControlValue("PUBLICIDADSUBTITULO")},nac:gx.falseFn};n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,lvl:0,type:"char",len:256,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADDESCRIPCION",gxz:"Z186PublicidadDescripcion",gxold:"O186PublicidadDescripcion",gxvar:"A186PublicidadDescripcion",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A186PublicidadDescripcion=n)},v2z:function(n){n!==undefined&&(gx.O.Z186PublicidadDescripcion=n)},v2c:function(){gx.fn.setControlValue("PUBLICIDADDESCRIPCION",gx.O.A186PublicidadDescripcion,0)},c2v:function(){this.val()!==undefined&&(gx.O.A186PublicidadDescripcion=this.val())},val:function(){return gx.fn.getControlValue("PUBLICIDADDESCRIPCION")},nac:gx.falseFn};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"",grid:0};n[53]={id:53,fld:"",grid:0};n[54]={id:54,lvl:0,type:"bits",len:1024,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADIMAGEN",gxz:"Z187PublicidadImagen",gxold:"O187PublicidadImagen",gxvar:"A187PublicidadImagen",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A187PublicidadImagen=n)},v2z:function(n){n!==undefined&&(gx.O.Z187PublicidadImagen=n)},v2c:function(){gx.fn.setMultimediaValue("PUBLICIDADIMAGEN",gx.O.A187PublicidadImagen,gx.O.A40000PublicidadImagen_GXI)},c2v:function(){gx.O.A40000PublicidadImagen_GXI=this.val_GXI();this.val()!==undefined&&(gx.O.A187PublicidadImagen=this.val())},val:function(){return gx.fn.getBlobValue("PUBLICIDADIMAGEN")},val_GXI:function(){return gx.fn.getControlValue("PUBLICIDADIMAGEN_GXI")},gxvar_GXI:"A40000PublicidadImagen_GXI",nac:gx.falseFn};n[55]={id:55,fld:"",grid:0};n[56]={id:56,fld:"",grid:0};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMENUAPP",gxz:"Z188PublicidadMenuApp",gxold:"O188PublicidadMenuApp",gxvar:"A188PublicidadMenuApp",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.A188PublicidadMenuApp=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z188PublicidadMenuApp=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("PUBLICIDADMENUAPP",gx.O.A188PublicidadMenuApp,!0)},c2v:function(){this.val()!==undefined&&(gx.O.A188PublicidadMenuApp=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("PUBLICIDADMENUAPP")},nac:gx.falseFn,values:["true","false"]};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"",grid:0};n[62]={id:62,fld:"",grid:0};n[63]={id:63,fld:"",grid:0};n[64]={id:64,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMENUWEB",gxz:"Z189PublicidadMenuWeb",gxold:"O189PublicidadMenuWeb",gxvar:"A189PublicidadMenuWeb",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.A189PublicidadMenuWeb=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z189PublicidadMenuWeb=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("PUBLICIDADMENUWEB",gx.O.A189PublicidadMenuWeb,!0)},c2v:function(){this.val()!==undefined&&(gx.O.A189PublicidadMenuWeb=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("PUBLICIDADMENUWEB")},nac:gx.falseFn,values:["true","false"]};n[65]={id:65,fld:"",grid:0};n[66]={id:66,fld:"",grid:0};n[67]={id:67,fld:"",grid:0};n[68]={id:68,fld:"",grid:0};n[69]={id:69,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMOSTRARAPP",gxz:"Z190PublicidadMostrarApp",gxold:"O190PublicidadMostrarApp",gxvar:"A190PublicidadMostrarApp",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.A190PublicidadMostrarApp=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z190PublicidadMostrarApp=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("PUBLICIDADMOSTRARAPP",gx.O.A190PublicidadMostrarApp,!0)},c2v:function(){this.val()!==undefined&&(gx.O.A190PublicidadMostrarApp=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("PUBLICIDADMOSTRARAPP")},nac:gx.falseFn,values:["true","false"]};n[70]={id:70,fld:"",grid:0};n[71]={id:71,fld:"",grid:0};n[72]={id:72,fld:"",grid:0};n[73]={id:73,fld:"",grid:0};n[74]={id:74,lvl:0,type:"boolean",len:4,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PUBLICIDADMOSTRARWEB",gxz:"Z191PublicidadMostrarWeb",gxold:"O191PublicidadMostrarWeb",gxvar:"A191PublicidadMostrarWeb",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(n){n!==undefined&&(gx.O.A191PublicidadMostrarWeb=gx.lang.booleanValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z191PublicidadMostrarWeb=gx.lang.booleanValue(n))},v2c:function(){gx.fn.setCheckBoxValue("PUBLICIDADMOSTRARWEB",gx.O.A191PublicidadMostrarWeb,!0)},c2v:function(){this.val()!==undefined&&(gx.O.A191PublicidadMostrarWeb=gx.lang.booleanValue(this.val()))},val:function(){return gx.fn.getControlValue("PUBLICIDADMOSTRARWEB")},nac:gx.falseFn,values:["true","false"]};n[75]={id:75,fld:"",grid:0};n[76]={id:76,fld:"",grid:0};n[77]={id:77,fld:"",grid:0};n[78]={id:78,fld:"",grid:0};n[79]={id:79,fld:"BTN_ENTER",grid:0,evt:"e13088_client",std:"ENTER"};n[80]={id:80,fld:"",grid:0};n[81]={id:81,fld:"BTN_CANCEL",grid:0,evt:"e14088_client"};n[82]={id:82,fld:"",grid:0};n[83]={id:83,fld:"BTN_DELETE",grid:0,evt:"e20088_client",std:"DELETE"};this.A183PublicidadId=0;this.Z183PublicidadId=0;this.O183PublicidadId=0;this.A184PublicidadTitulo="";this.Z184PublicidadTitulo="";this.O184PublicidadTitulo="";this.A185PublicidadSubTitulo="";this.Z185PublicidadSubTitulo="";this.O185PublicidadSubTitulo="";this.A186PublicidadDescripcion="";this.Z186PublicidadDescripcion="";this.O186PublicidadDescripcion="";this.A40000PublicidadImagen_GXI="";this.A187PublicidadImagen="";this.Z187PublicidadImagen="";this.O187PublicidadImagen="";this.A188PublicidadMenuApp=!1;this.Z188PublicidadMenuApp=!1;this.O188PublicidadMenuApp=!1;this.A189PublicidadMenuWeb=!1;this.Z189PublicidadMenuWeb=!1;this.O189PublicidadMenuWeb=!1;this.A190PublicidadMostrarApp=!1;this.Z190PublicidadMostrarApp=!1;this.O190PublicidadMostrarApp=!1;this.A191PublicidadMostrarWeb=!1;this.Z191PublicidadMostrarWeb=!1;this.O191PublicidadMostrarWeb=!1;this.A40000PublicidadImagen_GXI="";this.AV11Pgmname="";this.AV9TrnContext={CallerObject:"",CallerOnDelete:!1,CallerURL:"",TransactionName:"",Attributes:[]};this.AV7PublicidadId=0;this.AV10WebSession={};this.A183PublicidadId=0;this.A184PublicidadTitulo="";this.A185PublicidadSubTitulo="";this.A186PublicidadDescripcion="";this.A187PublicidadImagen="";this.A188PublicidadMenuApp=!1;this.A189PublicidadMenuWeb=!1;this.A190PublicidadMostrarApp=!1;this.A191PublicidadMostrarWeb=!1;this.Gx_mode="";this.Events={e12082_client:["AFTER TRN",!0],e13088_client:["ENTER",!0],e14088_client:["CANCEL",!0]};this.EvtParms.ENTER=[[{postForm:!0},{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0},{av:"AV7PublicidadId",fld:"vPUBLICIDADID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0},{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}],[{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}]];this.EvtParms.REFRESH=[[{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0},{av:"AV9TrnContext",fld:"vTRNCONTEXT",pic:"",hsh:!0},{av:"AV7PublicidadId",fld:"vPUBLICIDADID",pic:"ZZZZZZZZZZZZZZZZZ9",hsh:!0},{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}],[{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}]];this.EvtParms.START=[[{av:"AV11Pgmname",fld:"vPGMNAME",pic:""},{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}],[{av:"AV9TrnContext",fld:"vTRNCONTEXT",pic:"",hsh:!0},{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}]];this.EvtParms["AFTER TRN"]=[[{av:"Gx_mode",fld:"vMODE",pic:"@!",hsh:!0},{av:"AV9TrnContext",fld:"vTRNCONTEXT",pic:"",hsh:!0},{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}],[{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}]];this.EvtParms.VALID_PUBLICIDADID=[[{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}],[{av:"A188PublicidadMenuApp",fld:"PUBLICIDADMENUAPP",pic:""},{av:"A189PublicidadMenuWeb",fld:"PUBLICIDADMENUWEB",pic:""},{av:"A190PublicidadMostrarApp",fld:"PUBLICIDADMOSTRARAPP",pic:""},{av:"A191PublicidadMostrarWeb",fld:"PUBLICIDADMOSTRARWEB",pic:""}]];this.EnterCtrl=["BTN_ENTER"];this.setVCMap("AV7PublicidadId","vPUBLICIDADID",0,"int",18,0);this.setVCMap("A40000PublicidadImagen_GXI","PUBLICIDADIMAGEN_GXI",0,"svchar",2048,0);this.setVCMap("AV11Pgmname","vPGMNAME",0,"char",129,0);this.setVCMap("Gx_mode","vMODE",0,"char",3,0);this.setVCMap("AV9TrnContext","vTRNCONTEXT",0,"TransactionContext",0,0);this.Initialize()});gx.wi(function(){gx.createParentObj(this.publicidadapp)})