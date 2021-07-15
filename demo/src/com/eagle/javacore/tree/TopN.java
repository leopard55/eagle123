package com.eagle.javacore.tree;

public class TopN {

    //父节点
    private int parent(int n){
        return (n - 1)/2;
    }

    //左孩子
    private int left(int n){
        return 2 * n + 1;
    }

    //右孩子
    private int right(int n){
        return 2 * n + 2;
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void heapify(int tree[], int n, int i){
        if(i >= n){
            return ;
        }
        int c1 = 2*i +1;
        int c2 = 2*i +2;
        int min = i;
        if(c1 < n && tree[c1] < tree[min]){
            min = c1;
        }
        if(c2 < n && tree[c2] < tree[min]){
            min = c2;
        }
        if(min!=i){
            swap(tree, min, i);
            heapify(tree, n, min);
        }
    }

    public void buildHeap(int tree[], int n){
        int last_node = n-1;
        int parent = (last_node - 1)/2;
        int i ;
        for (i = parent; i >= 0; i--){
            heapify(tree, n, i);
        }
    }

    private void adjust(int i, int n, int[] data){
        if(data[i] <= data[0]){
            return;
        }
        //置换堆顶
        int temp = data[i];
        data[i] = data[0];
        data[0] = temp;

        //调整堆顶
        int t = 0;
        while((left(t) < n && data[t] > data[left(t)])
            || (right(t) < n && data[t] > data[right(t)])){

            if(right(t) < n && data[right(t)] < data[left(t)]){
                //右孩子更小，置换右孩子
                temp = data[t];
                data[t] = data[right(t)];
                data[right(t)] = temp;
                t = right(t);
            }else{
                //否则置换左孩子
                temp = data[t];
                data[t] = data[left(t)];
                data[left(t)] = temp;
                t = left(t);
            }
        }
    }

    //寻找topN，该方法改变data,将topN排到最前面
    public void findTopN(int n, int[] data){
        //
        buildHeap(data, n);

        for(int i = n; i<data.length; i++){
            adjust(i, n, data);
        }
    }

    public void print(int[] data, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TopN topN = new TopN();

        int[] arr1 = new int[]{56,30,71,18,29,93,44,75,20,65,68,34};
        System.out.println("原数组："  );
        topN.print(arr1, arr1.length);
        int fintN = 5;
        topN.findTopN(fintN,arr1);
        System.out.println("调整后：");
        topN.print(arr1, fintN);
    }

}
