<template>
  <div class="dashboard-container">
    <div class="dashboard-text">mytest</div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import axios from 'axios'

export default {
  name: 'Mytest',
  computed: {
    ...mapGetters([
      'name'
    ])
  },
  created(){

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
