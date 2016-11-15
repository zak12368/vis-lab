package com.github.mavogel.vislab.user.model;/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2016 Manuel Vogel
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 *
 *  https://opensource.org/licenses/MIT
 */

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mavogel on 11/15/16.
 */
@Entity
public class User {

    @Id
    private Long id;
    private String name;
<<<<<<< HEAD
    private String username;
    private String lastname;
    private String password;
=======
>>>>>>> 9d6f806e8a84474f76dc3e3925718b02a5940bba

    public User(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }
<<<<<<< HEAD

    public Long getId() {
        return id;
    }

    public void setId(final Long id){
        this.id = id;
    }


    public String getName(){
        return name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(final String username){
        this.username = username;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(final String lastname){
        this.lastname = lastname;
    }

    public void setPassword(String password){
        this.password = password;
    }
=======
>>>>>>> 9d6f806e8a84474f76dc3e3925718b02a5940bba
}
