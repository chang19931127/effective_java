package me.czd.effective.java.objectsmethod.clone;

/**
 * 一个类为了clone 付出的代价
 * 
 * @author Administrator
 *
 */
public class HashTable implements Cloneable {
	private Entry[] buckets;

	/**
	 * 省略其他方法
	 * 注意clone方法是浅copy
	 */
	
	private static class Entry {
		final Object key;
		Object value;
		Entry next;

		public Entry(Object key, Object value, Entry next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}

		Entry deepCopy() {
			return new Entry(key, value, next == null ? null : next.deepCopy());
		}
	}

	@Override
	protected HashTable clone() throws CloneNotSupportedException {
		try {
			HashTable result = (HashTable) super.clone();
			result.buckets = new Entry[buckets.length];
			for (int i = 0; i < buckets.length; i++) {
				if (buckets[i] != null) {
					result.buckets[i] = buckets[i].deepCopy();
				}
			}
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}

	}

}
