/**
 * 并发工具优先于wait和notify
 * 
 * 这个道理应该很简单把，你有自信你就使用wait，notify去写一个并发工具
 * 没有就老老实实用别人提供的工具把！基本场景都有相对的工具
 * 
 * 因此，这些工具的思路，我们应该知道，做到最装逼的，我会写但是我不写！哈哈
 * 
 * 三大工具ExecutorFramework，ConcurrentCollection，Synchronizer
 * 并发是一个很重要的内容，涉及面很广，需要专门去研究一下下
 * 
 * 还有一个特点
 * 如果使用wait()方法的时候，切记，请使用while(){
 * 
 * }
 * 
 * 不要使用if否则会有你意想不到的问题出现
 * 
 * 占坑，后续再来填
 * @author Administrator
 *
 */
package me.czd.effective.java.concurrent.utilsisbetterwait;