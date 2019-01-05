package com.mindorks.mindorkssqlitedatabase

/**
 * Created by akshaynandwana on
 * 05, January, 2019
 **/
class Name {

    var id: Int = 0
    var userName: String? = null

    constructor(id: Int, userName: String) {
        this.id = id
        this.userName = userName
    }

    constructor(userName: String) {
        this.userName = userName
    }
}