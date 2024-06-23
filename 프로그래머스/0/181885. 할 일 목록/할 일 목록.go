func solution(todo_list []string, finished []bool) []string {
    
    not_finished_list := []string{}
    
    for i := range todo_list {
        if !finished[i]{
            not_finished_list = append(not_finished_list, todo_list[i])
        }
    }
    
    return not_finished_list
}