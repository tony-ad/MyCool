//
//
//1.使用Get方式请求数据返回StringRequest对象
///**
// *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
// *  method：请求方式，Get请求为Method.GET，Post请求为Method.POST
// *  url：请求地址
// *  listener：请求成功后的回调
// *  errorListener：请求失败的回调
// */
//private void volleyGet() {
//    String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=15850781443";
//    StringRequest request = new StringRequest(Method.GET, url,
//            new Listener<String>() {
//                @Override
//                public void onResponse(String s) {//s为请求返回的字符串数据
//                    Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//                }
//            },
//            new ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError volleyError) {
//                    Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                }
//            });
//    //设置请求的Tag标签，可以在全局请求队列中通过Tag标签进行请求的查找
//    request.setTag("testGet");
//    //将请求加入全局队列中
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//
//2.使用Post方式请求数据返回StringRequest对象
///**
// * 使用Post方式返回String类型的请求结果数据
// * 
// *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
// *  method：请求方式，Get请求为Method.GET，Post请求为Method.POST
// *  url：请求地址
// *  listener：请求成功后的回调
// *  errorListener：请求失败的回调
// */
//private void volleyPost() {
//    String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm";
//    StringRequest request = new StringRequest(Method.POST, url,
//            new Listener<String>() {
//                @Override
//                public void onResponse(String s) {//s为请求返回的字符串数据
//                    Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//                }
//            },
//            new ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError volleyError) {
//                    Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                }
//            }){
//                @Override
//                protected Map<String, String> getParams() throws AuthFailureError {
//                    Map<String,String> map = new HashMap<>();
//                    //将请求参数名与参数值放入map中
//                    map.put("tel","15850781443");
//                    return map;
//                }
//            }
//            ;
//    //设置请求的Tag标签，可以在全局请求队列中通过Tag标签进行请求的查找
//    request.setTag("testPost");
//    //将请求加入全局队列中
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//3.使用ImageRequest加载网络图片
///**
// *  通过Volley加载网络图片
// *
// *  new ImageRequest(String url,Listener listener,int maxWidth,int maxHeight,Config decodeConfig,ErrorListener errorListener)
// *  url：请求地址
// *  listener：请求成功后的回调
// *  maxWidth、maxHeight：设置图片的最大宽高，如果均设为0则表示按原尺寸显示
// *  decodeConfig：图片像素的储存方式。Config.RGB_565表示每个像素占2个字节，Config.ARGB_8888表示每个像素占4个字节等。
// *  errorListener：请求失败的回调
// */
//private void loadImageByVolley() {
//    String url = "http://pic20.nipic.com/20120409/9188247_091601398179_2.jpg";
//    ImageRequest request = new ImageRequest(
//                        url,
//                        new Listener<Bitmap>() {
//                            @Override
//                            public void onResponse(Bitmap bitmap) {
//                                image.setImageBitmap(bitmap);
//                            }
//                        },
//                        0, 0, Config.RGB_565,
//                        new ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError volleyError) {
//                                image.setImageResource(R.mipmap.ic_launcher);
//                            }
//                        });
//
//    //设置请求的Tag标签，可以在全局请求队列中通过Tag标签进行请求的查找
//    request.setTag("loadImage");
//    //通过Tag标签取消请求队列中对应的全部请求
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//4.使用ImageLoader加载及缓存网络图片
///**
// *  通过ImageLoader加载及缓存网络图片
//*
// *  new ImageLoader(RequestQueue queue,ImageCache imageCache)
// *  queue：请求队列
// *  imageCache：一个用于图片缓存的接口，一般需要传入它的实现类
// *
// *  getImageListener(ImageView view, int defaultImageResId, int errorImageResId)
// *  view：ImageView对象
// *  defaultImageResId：默认的图片的资源Id
// *  errorImageResId：网络图片加载失败时显示的图片的资源Id
// */
//private void loadImageWithCache() {
//    String url = "http://pic20.nipic.com/20120409/9188247_091601398179_2.jpg";
//    ImageLoader loader = new ImageLoader(MyApplication.getHttpQueues(), new BitmapCache());
//    ImageListener listener = loader.getImageListener(image,R.mipmap.ic_launcher,R.mipmap.ic_launcher);
//    //加载及缓存网络图片
//    loader.get(url,listener);
//}
//
//
//
//
//
//
//
//
