function gpxMenu(){function t(t,i){var r=!0,u=function(){var u=function(){r&&(t.jquery=$.noConflict(!0));i()};jQuery().slimmenu?u():n("gpxMenu/resources/jquery.slimmenu.min.js",u)};r?n("gpxMenu/resources/jquery-1.9.1.min.js",u):u()}function n(n,t){var r="",i;gx.basePath!=""&&(r="/"+gx.basePath);r+=gx.staticDirectory;n=r+n;console.log("loading: "+n);i=document.createElement("script");i.type="text/javascript";i.readyState?i.onreadystatechange=function(){(i.readyState=="loaded"||i.readyState=="complete")&&(i.onreadystatechange=null,t())}:i.onload=function(){t()};i.src=n;document.getElementsByTagName("head")[0].appendChild(i)}this.Menu;this.CollapsedTitle;this.ResizeWidth;this.Code;this.CollapsedBackColor;this.MainBackColor;this.SecondaryBackColor;this.FontColor;this.SetMenu=function(n){this.Menu=n};this.GetMenu=function(){};this.show=function(){this.IsPostBack||this.Refresh()};this.Refresh=function(){var n=this,i=function(){n.jquery(document).ready(function(t){var r,i;console.log("usercontrol.show: "+t.fn.jquery);var f="slimmenu"+(new Date).getTime(),e=n.processMenu(n.Menu,!0),u=new gx.text.stringBuffer;u.clear();u.append('<ul class="slimmenu" id="'+f+'">'+e+"<\/ul>");n.getContainerControl().innerHTML=u.toString();t("#"+f).slimmenu({resizeWidth:n.ResizeWidth,collapserTitle:n.CollapsedTitle,animSpeed:"medium",indentChildren:!0,childrenIndenter:"&raquo;"});t(".smClick").click(function(i){if(i.preventDefault(),n.ItemClick){var r=t(this).attr("smcode");n.Code=r;n.ItemClick()}});r=document.createElement("style");r.type="text/css";i="#"+n.ContainerName+" *{color: "+n.FontColor+"}\r";i+="#"+n.ContainerName+" .menu-collapser{background-color: "+n.CollapsedBackColor+"}\r";i+="#"+n.ContainerName+" ul.slimmenu li{background-color: "+n.MainBackColor+"}\r";i+="#"+n.ContainerName+" ul.slimmenu li ul li{background-color: "+n.SecondaryBackColor+"}";r.innerHTML=i;document.getElementsByTagName("head")[0].appendChild(r)});window.$?console.log("JQuery final: "+$.fn.jquery):console.log("JQuery final: Not defined")};t(this,i)};this.processMenu=function(n,t){var r,u,i,f,e;if(typeof n=="object"&&n.length){for(r=[],u=0;u<n.length;u++)i=n[u],f=!1,i.SubItems&&i.SubItems.length>0&&(f=!0),i.URL!=""?(e="",i.LinkTarget!=""&&(e=' target="'+i.LinkTarget+'"'),r.push('<li><a href="'+i.URL+'" '+e+">"+gx.getMessage(i.Title)+"<\/a>")):f?r.push('<li><a href="#">'+gx.getMessage(i.Title)+"<\/a>"):r.push('<li><a href="#" class="smClick" smcode="'+i.Code+'" >'+gx.getMessage(i.Title)+"<\/a>"),f&&r.push(this.processMenu(i.SubItems,!1));return t?r.join(""):"<ul>"+r.join("")+"<\/ul>"}}}