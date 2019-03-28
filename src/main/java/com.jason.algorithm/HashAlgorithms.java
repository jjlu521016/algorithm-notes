package com.jason.algorithm;

public class HashAlgorithms {

    /**
     * 旋转hash
     *通过利用各种位运算（移位和异位）来充分的混合输入元素
     * @param key
     *            输入字符串
     * @param prime
     *            质数
     * @return hash值
     */
    public static int rotatingHash(String key, int prime) {
        int hash, i;
        for (hash = key.length(), i = 0; i < key.length(); ++i) {
            hash = (hash << 4) ^ (hash >> 28) ^ key.charAt(i);
        }
        return (hash % prime);
        // return (hash ^ (hash>>10) ^ (hash>>20));
    }

    /**
     * Bernstein's hash 乘法Hash
     *这样的类型的Hash函数利用了乘法的不相关性（乘法的这样的性质，最有名的莫过于平方取头尾的随机数生成算法，尽管这样的算法效果并不好）
     * String类的hashCode()方法也使用乘法Hash。只是，它使用的乘数是31
     * @param key
     *            输入字节数组
     * @return 结果hash
     */
    public static int bernstein(String key) {
        int hash = 0;
        int i;
        for (i = 0; i < key.length(); ++i) {
            hash = 31 * hash + key.charAt(i);
        }
        return hash;
    }

    /**
     * 改进的32位FNV算法1
     *
     * @param data
     *            字符串
     * @return int值
     */
    public static int FNVHash1(String data) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < data.length(); i++) {
            hash = (hash ^ data.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        return hash;
    }

        public static void main(String[] args) {
//        System.out.println(rotatingHash("test",29));

            System.out.println(bernstein("32"));
    }
}
