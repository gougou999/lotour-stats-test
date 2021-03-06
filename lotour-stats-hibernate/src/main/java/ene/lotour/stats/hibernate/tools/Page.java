package ene.lotour.stats.hibernate.tools;

import java.util.List;

/**
 * Created by zhangrui on 2014/7/8.
 */
public class Page<T> {
    /**
     * 分页的大小
     */
    private int size;
    /**
     * 分页的起始页
     */
    private int offset;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 分页的数据
     */
    private List<T> datas;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<T> getDatas() {
        return datas;
    }
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
