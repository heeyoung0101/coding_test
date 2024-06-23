func solution(order []string) int {
    price := 0
    
    for _, menu := range order {
        switch menu {
            case "iceamericano":fallthrough // go는 break이 default라 fallthrouth을 붙여야 함
            case "americanoice":fallthrough
            case "hotamericano":fallthrough
            case "americanohot":fallthrough
            case "americano"   :fallthrough
            case "anything"    :price += 4500
            case "icecafelatte":fallthrough
            case "cafelatteice":fallthrough
            case "hotcafelatte":fallthrough
            case "cafelattehot":fallthrough
            case "cafelatte"   :price += 5000
        }   
    }
    return price
}