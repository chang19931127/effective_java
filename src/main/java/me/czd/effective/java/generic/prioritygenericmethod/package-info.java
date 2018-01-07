/**
 * 优先考虑泛型方法
 * 加入类可以从泛型中受益，那么方法也可以，静态工具方法尤其适合泛型化
 * Coolections中很多方法和Arrays都是用了泛型方法
 * 
 * 那么我们也应该选择泛型方法，以及学会编写泛型方法
 * 
 * 泛型方法就像泛型一样，使用起来比要求客户但转换输入参数并返回值的方法来的更加安全，也更加容易
 * 就像类型一样，你应该确保新方法可以不用转换就能使用，这通常意味着要将它泛型化，就像类型一样，还应该将
 * 现有的方法泛型化，使新用户使用起来更加轻松，且不会破坏现有的客户端
 * @author Administrator
 *
 */
package me.czd.effective.java.generic.prioritygenericmethod;