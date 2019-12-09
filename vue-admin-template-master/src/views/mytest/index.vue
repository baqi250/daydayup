<template>
  <div class="dashboard-container">
    <div class="dashboard-text">{{tename}}</div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import axios from 'axios'

export default {
  name: 'Mytest',
  data(){
      return{
        tename: '111'
      }
      
  },
  computed: {
    ...mapGetters([
      'name'
    ])
  },
  created(){
      axios.get('http://localhost:8084/hello')
      .then(response=>{
          console.log(response);
          this.tename=response.data;
      })
      .catch(error=>{
          console.log(error);
      })
  }
}
</script>

<style lang="scss" scoped>
.dashboard {
  &-container {
    margin: 30px;
  }
  &-text {
    font-size: 30px;
    line-height: 46px;
  }
}
</style>
