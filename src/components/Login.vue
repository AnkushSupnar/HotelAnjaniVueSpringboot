<template>
  <div class="vue-tempalte">
    <form @submit.prevent="handleLogin">
      <h3>Sign In</h3>
      <div class="form-group">
        <label>User Name</label>
        <input
          type="text"
          v-model="username"
          placeholder="Enter User Name"
          class="form-control form-control-lg"
        />
      </div>

      <div class="form-group">
        <label>Password</label>
        <input
          type="password"
          v-model="password"
          class="form-control form-control-lg"
        />
      </div>

      <button class="btn btn-success btn-lg btn-block mt-5">
        LOGIN
      </button>

      <div class="social-icons">
        <ul>
          <li>
            <a href="#"><i class="fa fa-google"></i></a>
          </li>
          <li>
            <a href="#"><i class="fa fa-facebook"></i></a>
          </li>
          <li>
            <a href="#"><i class="fa fa-twitter"></i></a>
          </li>
        </ul>
      </div>
    </form>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "Login",
  data() {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    handleLogin() {
        const data={
            username: this.username,
            password: this.password
        }
      
      console.log("Login clicked",data);
      axios.get(`http://localhost:8080/api/user/validate/{data.username}/1231);
    },
  },
};
</script>
