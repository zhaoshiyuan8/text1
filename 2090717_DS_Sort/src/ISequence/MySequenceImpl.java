package ISequence;

import java.util.Arrays;

public class MySequenceImpl implements ISequence{
    private Object[] elem;
    private int usedSize;
    //默认顺序表的容量
    private  static  final int DEFAYLT_SIZE = 10;
    public MySequenceImpl(){
        this.elem = new Object[DEFAYLT_SIZE];
        this.usedSize = 0;
    }
    public  boolean isFull(){
        if (usedSize == elem.length){
            return true;
        }
        return false;
    }

    @Override
    public boolean add(int pos, Object data) {
        //1、pos的合法性；  2、是否是满的顺序表
        if (pos<0 || pos > usedSize){
            return false;
        }
        if (isFull()){
            //让数组扩大原来的2倍
            this.elem = Arrays.copyOf(elem,elem.length*2);
        }
        for (int i = usedSize-1; i >= pos ; i--) {

        }
        return false;
    }

    @Override
    public int search(Object key) {
        return 0;
    }

    @Override
    public boolean contains(Object key) {
        return false;
    }

    @Override
    public Object getPos(int pos) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
