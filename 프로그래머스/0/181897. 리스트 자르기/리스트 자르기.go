func solution(n int, c []int, num_list []int) []int {
    
    slice := []int{}
    indexA := c[0]
    indexB := c[1]
    indexC := c[2]
    
    switch n {
    case 1: 
        slice = num_list[0:indexB + 1]
    case 2:
        slice = num_list[indexA:len(num_list)]
    case 3:
        slice = num_list[indexA:indexB + 1]
    case 4:
        tempSlice := num_list[indexA:indexB + 1]
        for i, num := range tempSlice {
            if i % indexC == 0 || i == 0 { // i가 0이거나 indexC의 배수일 때
                slice = append(slice, num)
            }
        }
    }
    
    
    return slice
}