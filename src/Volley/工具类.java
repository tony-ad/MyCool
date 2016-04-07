//
//
//1.ʹ��Get��ʽ�������ݷ���StringRequest����
///**
// *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
// *  method������ʽ��Get����ΪMethod.GET��Post����ΪMethod.POST
// *  url�������ַ
// *  listener������ɹ���Ļص�
// *  errorListener������ʧ�ܵĻص�
// */
//private void volleyGet() {
//    String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=15850781443";
//    StringRequest request = new StringRequest(Method.GET, url,
//            new Listener<String>() {
//                @Override
//                public void onResponse(String s) {//sΪ���󷵻ص��ַ�������
//                    Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//                }
//            },
//            new ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError volleyError) {
//                    Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                }
//            });
//    //���������Tag��ǩ��������ȫ�����������ͨ��Tag��ǩ��������Ĳ���
//    request.setTag("testGet");
//    //���������ȫ�ֶ�����
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//
//2.ʹ��Post��ʽ�������ݷ���StringRequest����
///**
// * ʹ��Post��ʽ����String���͵�����������
// * 
// *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
// *  method������ʽ��Get����ΪMethod.GET��Post����ΪMethod.POST
// *  url�������ַ
// *  listener������ɹ���Ļص�
// *  errorListener������ʧ�ܵĻص�
// */
//private void volleyPost() {
//    String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm";
//    StringRequest request = new StringRequest(Method.POST, url,
//            new Listener<String>() {
//                @Override
//                public void onResponse(String s) {//sΪ���󷵻ص��ַ�������
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
//                    //����������������ֵ����map��
//                    map.put("tel","15850781443");
//                    return map;
//                }
//            }
//            ;
//    //���������Tag��ǩ��������ȫ�����������ͨ��Tag��ǩ��������Ĳ���
//    request.setTag("testPost");
//    //���������ȫ�ֶ�����
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//3.ʹ��ImageRequest��������ͼƬ
///**
// *  ͨ��Volley��������ͼƬ
// *
// *  new ImageRequest(String url,Listener listener,int maxWidth,int maxHeight,Config decodeConfig,ErrorListener errorListener)
// *  url�������ַ
// *  listener������ɹ���Ļص�
// *  maxWidth��maxHeight������ͼƬ������ߣ��������Ϊ0���ʾ��ԭ�ߴ���ʾ
// *  decodeConfig��ͼƬ���صĴ��淽ʽ��Config.RGB_565��ʾÿ������ռ2���ֽڣ�Config.ARGB_8888��ʾÿ������ռ4���ֽڵȡ�
// *  errorListener������ʧ�ܵĻص�
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
//    //���������Tag��ǩ��������ȫ�����������ͨ��Tag��ǩ��������Ĳ���
//    request.setTag("loadImage");
//    //ͨ��Tag��ǩȡ����������ж�Ӧ��ȫ������
//    MyApplication.getHttpQueues().add(request);
//}
//
//
//
//4.ʹ��ImageLoader���ؼ���������ͼƬ
///**
// *  ͨ��ImageLoader���ؼ���������ͼƬ
//*
// *  new ImageLoader(RequestQueue queue,ImageCache imageCache)
// *  queue���������
// *  imageCache��һ������ͼƬ����Ľӿڣ�һ����Ҫ��������ʵ����
// *
// *  getImageListener(ImageView view, int defaultImageResId, int errorImageResId)
// *  view��ImageView����
// *  defaultImageResId��Ĭ�ϵ�ͼƬ����ԴId
// *  errorImageResId������ͼƬ����ʧ��ʱ��ʾ��ͼƬ����ԴId
// */
//private void loadImageWithCache() {
//    String url = "http://pic20.nipic.com/20120409/9188247_091601398179_2.jpg";
//    ImageLoader loader = new ImageLoader(MyApplication.getHttpQueues(), new BitmapCache());
//    ImageListener listener = loader.getImageListener(image,R.mipmap.ic_launcher,R.mipmap.ic_launcher);
//    //���ؼ���������ͼƬ
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
