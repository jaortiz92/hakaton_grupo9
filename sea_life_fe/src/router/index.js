import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../components/Home.vue'
import Adventure from '../components/Adventure.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/Adventure',
    name: 'Adventure',
    component: Adventure
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
