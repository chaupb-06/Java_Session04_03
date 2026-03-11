package baitap;

import java.util.Scanner;

public class Java_Session04_03 {
    public static int timkiemNhiPhan(int[] arr, int x) {
        int n = arr.length;
        int ls = 0, rs = n-1;
        while (ls <= rs) {
            int mid = ls + (rs - ls) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                rs = mid - 1;
            }
            else if (arr[mid] > x) {
                ls = mid + 1;
            }
        }
        return -1;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int max_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ "+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        int[] b = a;
        System.out.println("Mảng sau khi được sắp xếp giảm dần:");
        selectionSort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n-1) System.out.print(" ");
        }
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        int x = sc.nextInt();
        System.out.print("Tìm kiếm tuyến tính: ");
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == x) {
                c1 = i;
                break;
            }
        }
        System.out.println("Số "+x+" có tại vị trí "+c1);
        System.out.print("Tìm kiếm nhị phân: ");
        c2 = timkiemNhiPhan(a,x);
        System.out.println("Số "+x+" có tại vị trí "+c2);

    }
}
