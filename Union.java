class Union {
    public static void main(String[] args) {
        int a[] = {2, 3, 6, 1, 4, 7, 8};
        int b[] = {1, 4, 8, 10};

        System.out.print("Union: ");
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = true; 
                    break;
                }
            }
            if (!flag) {
                System.out.print(a[i] + " ");
            }
        }

        // Print elements of b that are not in a
        for (int i = 0; i < b.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(b[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Intersection: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
