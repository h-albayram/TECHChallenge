package hadi.techchallenge.model

data class Order (var date :String,var month:String,var marketName:String,var orderName :String,
                  var productPrice:Double , var productState:String,var productDetail: List<ProductDetail>)