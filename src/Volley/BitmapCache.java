//package Volley;
//
//public class BitmapCache implements ImageLoader.ImageCache{
//    //LruCache�ǻ����ڴ�Ļ�����
//    private LruCache<String,Bitmap> lruCache;
//    //LruCache����󻺴��С
//    private int max = 10 * 1024 * 1024;
//
//    public BitmapCache() {
//        lruCache = new LruCache<String, Bitmap>(max){
//            @Override
//            //����ͼƬ�Ĵ�С
//            protected int sizeOf(String key, Bitmap value) {
//                return value.getRowBytes() * value.getHeight();
//            }
//        };
//    }
//
//    @Override
//    public Bitmap getBitmap(String s) {
//        return lruCache.get(s);
//    }
//
//    @Override
//    public void putBitmap(String s, Bitmap bitmap) {
//        lruCache.put(s,bitmap);
//    }
//}
