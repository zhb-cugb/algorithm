package com.haipo;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        float[] datas = {-2.1f, -1.3f, -0.4f, 1.9f, 5.1f, 6.2f};
        float[] samples = {-2, -1, 0, 1, 2, 3,4,5,6,7};

        KernelEstimator ke = new KernelEstimator();
        float[] res = ke.estimate(2,datas, samples);

        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(res[3]);
        System.out.println(res[4]);
        System.out.println(res[5]);
        System.out.println(res[6]);
        System.out.println(res[7]);
        System.out.println(res[8]);
        System.out.println(res[9]);

    }
}
