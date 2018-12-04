# algorithm
java 常见算法实现

## 核密度估计 KERNEL DENSITY ESTIMATE
Let (x1, x2, …, xn) be a univariate independent and identically distributed sample drawn from some distribution with an unknown density ƒ. We are interested in estimating the shape of this function ƒ. Its kernel density estimator is

![Image test](https://wikimedia.org/api/rest_v1/media/math/render/svg/15255412d35488194b7e24e4518765e0af9992b5)

where K is the kernel — a non-negative function — and h > 0 is a smoothing parameter called the bandwidth. A kernel with subscript h is called the scaled kernel and defined as Kh(x) = 1/h K(x/h). Intuitively one wants to choose h as small as the data will allow; however, there is always a trade-off between the bias of the estimator and its variance. The choice of bandwidth is discussed in more detail below.

A range of kernel functions are commonly used: uniform, triangular, biweight, triweight, Epanechnikov, normal, and others. The Epanechnikov kernel is optimal in a mean square error sense,[3] though the loss of efficiency is small for the kernels listed previously,[4] and due to its convenient mathematical properties, the normal kernel is often used, which means K(x) = ϕ(x), where ϕ is the standard normal density function.
