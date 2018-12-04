package com.haipo;

import static java.lang.Math.PI;
import static java.lang.Math.exp;
import static java.lang.Math.sqrt;
import static java.lang.System.nanoTime;

public class KernelEstimator {
    public float[] estimate(float bandwidth, float[] dataPoints, float[] estimationPoints) {

        for (int i = 0; i < estimationPoints.length; i++) {
            float estimationPoint = estimationPoints[i];
            estimationPoints[i] = estimateForPoint(estimationPoint, dataPoints, bandwidth);
        }
        return estimationPoints;
    }

    private float estimateForPoint(float estimatedPoint, float[] dataPoints, float bandwidth) {
        float estimate = 0;
        for (float dataPoint : dataPoints) {
            estimate += kernel((estimatedPoint - dataPoint) / bandwidth) / dataPoints.length;
        }
        return estimate ;
    }

    private float kernel(float x) {
        return new Float(exp(- x * x / 2) / sqrt(2 * PI));
    }
}
