package CodeFormat;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @url: https://github.com/yunwang1949/Java-/blob/master/JavaForm.java
 * @author: WangXL
 * @create: 2021-04-29 11:27
 **/

public class CodeFormat {
    public static void main(String[] args) {
        String str = "!function(){\"use strict\";function e(e){const t=[];for(const o of function(){try{return document.cookie.split(\";\")}catch(e){return[]}}()){const[n,r]=o.trim().split(\"=\");e===n&&void 0!==r&&t.push({key:n,value:r})}return t}var t=\"<unknown>\";function o(e){return e.split(\"\\n\").reduce((function(e,o){var u=function(e){var o=n.exec(e);if(!o)return null;var l=o[2]&&0===o[2].indexOf(\"native\"),i=o[2]&&0===o[2].indexOf(\"eval\"),c=r.exec(o[2]);i&&null!=c&&(o[2]=c[1],o[3]=c[2],o[4]=c[3]);return{file:l?null:o[2],methodName:o[1]||t,arguments:l?[o[2]]:[],lineNumber:o[3]?+o[3]:null,column:o[4]?+o[4]:null}}(o)||function(e){var o=l.exec(e);if(!o)return null;return{file:o[2],methodName:o[1]||t,arguments:[],lineNumber:+o[3],column:o[4]?+o[4]:null}}(o)||function(e){var o=i.exec(e);if(!o)return null;var n=o[3]&&o[3].indexOf(\" > eval\")>-1,r=c.exec(o[3]);n&&null!=r&&(o[3]=r[1],o[4]=r[2],o[5]=null);return{file:o[3],methodName:o[1]||t,arguments:o[2]?o[2].split(\",\"):[],lineNumber:o[4]?+o[4]:null,column:o[5]?+o[5]:null}}(o)||function(e){var o=a.exec(e);if(!o)return null;return{file:o[2],methodName:o[1]||t,arguments:[],lineNumber:+o[3],column:o[4]?+o[4]:null}}(o)||function(e){var o=s.exec(e);if(!o)return null;return{file:o[3],methodName:o[1]||t,arguments:[],lineNumber:+o[4],column:o[5]?+o[5]:null}}(o);return u&&e.push(u),e}),[])}var n=/^\\s*at (.*?) ?\\(((?:file|https?|blob|chrome-extension|native|eval|webpack|<anonymous>|\\/).*?)(?::(\\d+))?(?::(\\d+))?\\)?\\s*$/i,r=/\\((\\S*)(?::(\\d+))(?::(\\d+))\\)/;var l=/^\\s*at (?:((?:\\[object object\\])?.+) )?\\(?((?:file|ms-appx|https?|webpack|blob):.*?):(\\d+)(?::(\\d+))?\\)?\\s*$/i;var i=/^\\s*(.*?)(?:\\((.*?)\\))?(?:^|@)((?:file|https?|blob|chrome|webpack|resource|\\[native).*?|[^@]*bundle)(?::(\\d+))?(?::(\\d+))?\\s*$/i,c=/(\\S+) line (\\d+)(?: > eval line \\d+)* > eval/i;var s=/^\\s*(?:([^@]*)(?:\\((.*?)\\))?@)?(\\S.*?):(\\d+)(?::(\\d+))?\\s*$/i;var a=/^\\s*at (?:((?:\\[object object\\])?[^\\\\/]+(?: \\[as \\S+\\])?) )?\\(?(.*?):(\\d+)(?::(\\d+))?\\)?\\s*$/i;function u(e){const t=document.querySelectorAll(e);if(t.length>0)return t[t.length-1]}function f(){return`${window.location.protocol}//${window.location.host}${function(){const e=u(\"meta[name=analytics-location]\");return e?e.content:window.location.pathname}()+function(){let e=\"\";u(\"meta[name=analytics-location-query-strip]\")||(e=window.location.search);const t=u(\"meta[name=analytics-location-params]\");t&&(e+=(e?\"&\":\"?\")+t.content);for(const o of document.querySelectorAll(\"meta[name=analytics-param-rename]\")){const t=o.content.split(\":\",2);e=e.replace(new RegExp(`(^|[?&])${t[0]}($|=)`,\"g\"),`$1${t[1]}$2`)}return e}()}`}let d=!1,m=0;const p=Date.now();async function v(e){var t,o;if(!(!S&&!d&&m<10&&\"function\"==typeof Blob&&\"function\"==typeof PerformanceObserver&&\"undefined\"!=typeof Intl&&\"undefined\"!=typeof MutationObserver&&\"undefined\"!=typeof URLSearchParams&&\"undefined\"!=typeof WebSocket&&\"undefined\"!=typeof IntersectionObserver&&\"undefined\"!=typeof AbortController&&\"undefined\"!=typeof queueMicrotask&&\"undefined\"!=typeof TextEncoder&&\"undefined\"!=typeof TextDecoder&&\"undefined\"!=typeof customElements&&\"undefined\"!=typeof HTMLDetailsElement&&\"entries\"in FormData.prototype&&\"toggleAttribute\"in Element.prototype&&\"flatMap\"in Array.prototype)||function(e){var t,o;const n=null===(o=null===(t=e.head)||void 0===t?void 0:t.querySelector('meta[name=\"expected-hostname\"]'))||void 0===o?void 0:o.content;return!!n&&n.replace(/\\.$/,\"\").split(\".\").slice(-2).join(\".\")!==e.location.hostname.replace(/\\.$/,\"\").split(\".\").slice(-2).join(\".\")}(document))return;const n=null===(o=null===(t=document.head)||void 0===t?void 0:t.querySelector('meta[name=\"browser-errors-url\"]'))||void 0===o?void 0:o.content;if(n)if(e.error.stacktrace.some((e=>w.test(e.filename)||w.test(e.function))))d=!0;else{m++;try{await fetch(n,{method:\"post\",body:JSON.stringify(e)})}catch(r){}}}function h(e){return{type:e.name,value:e.message,stacktrace:b(e)}}function y(e,t={}){return Object.assign({error:e,sanitizedUrl:f()||window.location.href,readyState:document.readyState,referrer:document.referrer,timeSinceLoad:Math.round(Date.now()-p),user:g()||void 0},t)}function b(e){var t;const n=function(e){return o(e.stack||\"\").map((e=>({filename:e.file||\"\",function:String(e.methodName),lineno:(e.lineNumber||0).toString(),colno:(e.column||0).toString()})))}(e),r=null!==(t=e.framesToPop)&&void 0!==t?t:0;return 0===r?n:n.slice(r)}const w=/(chrome|moz|safari)-extension:\\/\\//;function g(){var t,o;const n=null===(o=null===(t=document.head)||void 0===t?void 0:t.querySelector('meta[name=\"user-login\"]'))||void 0===o?void 0:o.content;if(n)return n;const r=function(){let t=\"\";const o=e(\"_octo\"),n=[];for(const e of o){const o=e.value.split(\".\");if(\"GH1\"===o.shift()&&o.length>1){const e=(o.shift()||\"\").split(\"-\");1===e.length&&(e[1]=\"1\");const r=[Number(e[0]),Number(e[1])];t=o.join(\".\"),n.push([r,t])}}return t=\"\",n.length>0&&(t=String(n.sort().reverse()[0][1])),t}();return r?\"anonymous-\"+r:null}let S=!1;window.addEventListener(\"pageshow\",(()=>S=!1)),window.addEventListener(\"pagehide\",(()=>S=!0)),window.addEventListener(\"error\",(function(e){e.error&&v(y(h(e.error)))})),window.addEventListener(\"unhandledrejection\",(async function(e){if(e.promise)try{await e.promise}catch(t){!t||\"AbortError\"===t.name||t.response instanceof Response||v(y(h(t)))}})),\"#b00m\"===window.location.hash&&setTimeout((()=>{throw new Error(\"b00m\")})),window.requestIdleCallback=window.requestIdleCallback||function(e){var t=Date.now();return setTimeout((function(){e({didTimeout:!1,timeRemaining:function(){return Math.max(0,50-(Date.now()-t))}})}),1)},window.cancelIdleCallback=window.cancelIdleCallback||function(e){clearTimeout(e)};var x;(function(e,t){var o,n;o=window,n=document,e.exports={polyfill:function(){if(!(\"scrollBehavior\"in n.documentElement.style)||!0===o.__forceSmoothScrollPolyfill__){var e,t=o.HTMLElement||o.Element,r=(e=o.navigator.userAgent,new RegExp([\"MSIE \",\"Trident/\",\"Edge/\"].join(\"|\")).test(e)?1:0),l={scroll:o.scroll||o.scrollTo,scrollBy:o.scrollBy,elementScroll:t.prototype.scroll||c,scrollIntoView:t.prototype.scrollIntoView},i=o.performance&&o.performance.now?o.performance.now.bind(o.performance):Date.now;o.scroll=o.scrollTo=function(){void 0!==arguments[0]&&(!0!==s(arguments[0])?p.call(o,n.body,void 0!==arguments[0].left?~~arguments[0].left:o.scrollX||o.pageXOffset,void 0!==arguments[0].top?~~arguments[0].top:o.scrollY||o.pageYOffset):l.scroll.call(o,void 0!==arguments[0].left?arguments[0].left:\"object\"!=typeof arguments[0]?arguments[0]:o.scrollX||o.pageXOffset,void 0!==arguments[0].top?arguments[0].top:void 0!==arguments[1]?arguments[1]:o.scrollY||o.pageYOffset))},o.scrollBy=function(){void 0!==arguments[0]&&(s(arguments[0])?l.scrollBy.call(o,void 0!==arguments[0].left?arguments[0].left:\"object\"!=typeof arguments[0]?arguments[0]:0,void 0!==arguments[0].top?arguments[0].top:void 0!==arguments[1]?arguments[1]:0):p.call(o,n.body,~~arguments[0].left+(o.scrollX||o.pageXOffset),~~arguments[0].top+(o.scrollY||o.pageYOffset)))},t.prototype.scroll=t.prototype.scrollTo=function(){if(void 0!==arguments[0])if(!0!==s(arguments[0])){var e=arguments[0].left,t=arguments[0].top;p.call(this,this,void 0===e?this.scrollLeft:~~e,void 0===t?this.scrollTop:~~t)}else{if(\"number\"==typeof arguments[0]&&void 0===arguments[1])throw new SyntaxError(\"Value couldn't be converted\");l.elementScroll.call(this,void 0!==arguments[0].left?~~arguments[0].left:\"object\"!=typeof arguments[0]?~~arguments[0]:this.scrollLeft,void 0!==arguments[0].top?~~arguments[0].top:void 0!==arguments[1]?~~arguments[1]:this.scrollTop)}},t.prototype.scrollBy=function(){void 0!==arguments[0]&&(!0!==s(arguments[0])?this.scroll({left:~~arguments[0].left+this.scrollLeft,top:~~arguments[0].top+this.scrollTop,behavior:arguments[0].behavior}):l.elementScroll.call(this,void 0!==arguments[0].left?~~arguments[0].left+this.scrollLeft:~~arguments[0]+this.scrollLeft,void 0!==arguments[0].top?~~arguments[0].top+this.scrollTop:~~arguments[1]+this.scrollTop))},t.prototype.scrollIntoView=function(){if(!0!==s(arguments[0])){var e=d(this),t=e.getBoundingClientRect(),r=this.getBoundingClientRect();e!==n.body?(p.call(this,e,e.scrollLeft+r.left-t.left,e.scrollTop+r.top-t.top),\"fixed\"!==o.getComputedStyle(e).position&&o.scrollBy({left:t.left,top:t.top,behavior:\"smooth\"})):o.scrollBy({left:r.left,top:r.top,behavior:\"smooth\"})}else l.scrollIntoView.call(this,void 0===arguments[0]||arguments[0])}}function c(e,t){this.scrollLeft=e,this.scrollTop=t}function s(e){if(null===e||\"object\"!=typeof e||void 0===e.behavior||\"auto\"===e.behavior||\"instant\"===e.behavior)return!0;if(\"object\"==typeof e&&\"smooth\"===e.behavior)return!1;throw new TypeError(\"behavior member of ScrollOptions \"+e.behavior+\" is not a valid value for enumeration ScrollBehavior.\")}function a(e,t){return\"Y\"===t?e.clientHeight+r<e.scrollHeight:\"X\"===t?e.clientWidth+r<e.scrollWidth:void 0}function u(e,t){var n=o.getComputedStyle(e,null)[\"overflow\"+t];return\"auto\"===n||\"scroll\"===n}function f(e){var t=a(e,\"Y\")&&u(e,\"Y\"),o=a(e,\"X\")&&u(e,\"X\");return t||o}function d(e){var t;do{t=(e=e.parentNode)===n.body}while(!1===t&&!1===f(e));return t=null,e}function m(e){var t,n,r,l,c=(i()-e.startTime)/468;l=c=c>1?1:c,t=.5*(1-Math.cos(Math.PI*l)),n=e.startX+(e.x-e.startX)*t,r=e.startY+(e.y-e.startY)*t,e.method.call(e.scrollable,n,r),n===e.x&&r===e.y||o.requestAnimationFrame(m.bind(o,e))}function p(e,t,r){var s,a,u,f,d=i();e===n.body?(s=o,a=o.scrollX||o.pageXOffset,u=o.scrollY||o.pageYOffset,f=l.scroll):(s=e,a=e.scrollLeft,u=e.scrollTop,f=c),m({scrollable:s,method:f,startTime:d,startX:a,startY:u,x:t,y:r})}}}}(x={exports:{}},x.exports),x.exports).polyfill;window.getSelection&&!function(){const e=document.createElement(\"div\");return e.style.cssText=\"-ms-user-select: element; user-select: contain;\",\"element\"===e.style.getPropertyValue(\"-ms-user-select\")||\"contain\"===e.style.getPropertyValue(\"-ms-user-select\")||\"contain\"===e.style.getPropertyValue(\"user-select\")}()&&document.addEventListener(\"click\",(function(e){if(!(e.target instanceof Element))return;const t=e.target.closest(\".user-select-contain\");if(!t)return;const o=window.getSelection();if(!o.rangeCount)return;const n=o.getRangeAt(0).commonAncestorContainer;t.contains(n)||o.selectAllChildren(t)})),self.System=self.System||(()=>{const e={},t={},o=e=>e.replace(/-[a-f0-9]{8,}\\.js$/,\".js\"),n={register(r,l){const i=o(\"./\"+((document.currentScript||{}).src||\"\").split(\"?\").shift().split(\"/\").pop()),c={},s=l(((e,t)=>t?c[e]=t:Object.assign(c,e)),n),a=r.map(((e,t)=>n.import(o(e)).then(s.setters[t])));e[i]=Promise.all(a).then((()=>(s.execute(),c))),t[i]&&(t[i](e[i]),delete t[i])},import:o=>e[o]||(e[o]=new Promise(((e,n)=>{const r=setTimeout((()=>{n(new Error(`could not resolve ${o}, timeout after 10 seconds`))}),1e4),l=document.querySelector(`script[data-src][data-module-id=\"${o}\"]`);l&&(l.setAttribute(\"src\",l.getAttribute(\"data-src\")),l.removeAttribute(\"data-src\"),l.addEventListener(\"error\",(()=>{clearTimeout(r),n(new Error(`could not resolve ${o}, error loading the module`))}))),t[o]=t=>{clearTimeout(r),e(t)}})))};return n})(),Object.fromEntries||(Object.fromEntries=function(e){const t={};for(const o of e)t[o[0]]=o[1];return t})}();\n" +
                "//# sourceMappingURL=environment-6c305721.js.map";
        str = formJava(str);
        System.out.println(str);
    }


    /**
     * @说明 ：格式化java代码
     * @参数 ：@param dataTmp
     * @参数 ：@return
     * @返回 ：String
     * @作者 ：WangXL
     * @时间 ：2018 11 22
     **/
    public static String formJava(String data) {
        String dataTmp = replaceStrToUUid(data,"\"");
        dataTmp = replaceStrToUUid(dataTmp,"'");
        dataTmp = repalceHHF(dataTmp,"\n","");
        dataTmp = repalceHHF(dataTmp,"{","{\n");
        dataTmp = repalceHHF(dataTmp,"}","}\n");
        dataTmp = repalceHHF(dataTmp,"/*","\n/*\n");
        dataTmp = repalceHHF(dataTmp,"* @","\n* @");
        dataTmp = repalceHHF(dataTmp,"*/","\n*/\n");
        dataTmp = repalceHHF(dataTmp,";",";\n");
        dataTmp = repalceHHF(dataTmp,"//","\n//");
        dataTmp = repalceHHFX(dataTmp,"\n");
        for(Map.Entry<String, String> r : mapZY.entrySet()){
            dataTmp = dataTmp.replace(r.getKey(),r.getValue());
        }
        if(dataTmp==null)
            return data;
        return dataTmp;
    }

    public static Map<String,String> mapZY = new HashMap<String,String>();
    /**
     * @说明 ： 循环替换指定字符为随机uuid  并将uui存入全局map:mapZY
     * @参数 ：@param string   字符串
     * @参数 ：@param type    指定字符
     * @作者 ：WangXL
     * @时间 ：2018 11 23
     **/
    public static String replaceStrToUUid(String string,String type){
        Matcher slashMatcher = Pattern.compile(type).matcher(string);
        boolean bool = false;
        StringBuilder sb = new StringBuilder();
        int indexHome = -1; //开始截取下标
        while(slashMatcher.find()) {
            int indexEnd = slashMatcher.start();
            String tmp = string.substring(indexHome+1,indexEnd); //获取"号前面的数据
            if(indexHome == -1 ||bool == false){
                sb.append(tmp);
                bool = true;
                indexHome = indexEnd;
            }else{
                if(bool){
                    String tem2 = "";
                    for( int i=indexEnd-1 ; i>-1 ; i-- ){
                        char c = string.charAt(i);
                        if(c == '\\'){
                            tem2 += c;
                        }else{
                            break;
                        }
                    }
                    int tem2Len = tem2.length();
                    if(tem2Len>-1){
                        //结束符前有斜杠转义符 需要判断转义个数奇偶   奇数是转义了  偶数才算是结束符号
                        if(tem2Len % 2==1){
                            //奇数 非结束符
                        }else{
                            //偶数才算是结束符号
                            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                            uuid = type+uuid+type;
                            mapZY.put(uuid, type+tmp+type);
                            sb.append(uuid);
                            bool = false;
                            indexHome = indexEnd;
                        }
                    }
                }
            }
        }
        sb.append(string.substring(indexHome+1,string.length()));
        return sb.toString();
    }



    //处理换行
    public static String repalceHHF(String data,String a,String b){
        try{
            data = data.replace(a, "$<<yunwangA>>$<<yunwangB>>");
            String  arr[] = data.split("$<<yunwangA>>");
            StringBuilder result = new StringBuilder();
            if(arr != null){
                for(int i=0;i<arr.length;i++){
                    String t = arr[i];
                    result.append(t.trim());
                    if(t.indexOf("//")!=-1 && "\n".equals(a)){
                        result.append("\n");
                    }
                }
            }
            String res = result.toString();
            res = res.replace("$<<yunwangB>>", b);
            res = res.replace("$<<yunwangA>>", "");
            return res;
        }catch(Exception e){
        }
        return null;
    }

    //处理缩进
    public static String repalceHHFX(String data,String a){
        try{
            String  arr[] = data.split(a);
            StringBuilder result = new StringBuilder();
            if(arr != null){
                String zbf = "    ";
                Stack<String> stack = new Stack<String>();
                for(int i=0;i<arr.length;i++){
                    String tem = arr[i].trim();
                    if(tem.indexOf("{")!=-1){
                        String kg = getStack(stack,false);
                        if(kg == null){
                            result.append((tem+"\n"));
                            kg = "";
                        }else{
                            kg = kg + zbf;
                            result.append(kg+tem+"\n");
                        }
                        stack.push(kg);
                    }else if(tem.indexOf("}")!=-1){
                        String kg = getStack(stack,true);
                        if(kg == null){
                            result.append(tem+"\n");
                        }else{
                            result.append(kg+tem+"\n");
                        }
                    }else{
                        String kg = getStack(stack,false);
                        if(kg == null){
                            result.append(tem+"\n");
                        }else{
                            result.append(kg+zbf+tem+"\n");
                        }
                    }
                }
            }
            String res = result.toString();
            return res;
        }catch(Exception e){}
        return null;
    }

    /**
     * @说明 ： 获得栈数据
     * @参数 ：@param stack
     * @参数 ：@param bool true 弹出  false 获取
     * @时间 ：2018 11 22
     **/
    public static String getStack(Stack<String> stack,boolean bool){
        String result = null;
        try{
            if(bool){
                return stack.pop();
            }
            return stack.peek();
        }catch(EmptyStackException  e){
        }
        return result;
    }
}
