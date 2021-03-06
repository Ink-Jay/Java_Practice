/* Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall! NB: -1 means tree, else is person's height. */
int[] solution(int[] a) {
        
int [] heights  = Arrays.stream(a).filter(x -> x != -1).toArray();

Arrays.sort(height);
int index = 0;

    for (int i = 0; i < a.length; i++)
    {
        if (a[i] != -1)
        {
            a[i] = height[index++];
        }
    }
    return a;

}
