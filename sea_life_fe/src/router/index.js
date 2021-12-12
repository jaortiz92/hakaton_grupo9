import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../view/Home.vue'
import Adventure from '../view/AdventureView.vue'
import User from '../view/User.vue'
import Ranking from '../view/Ranking.vue'
import Administration from '../view/Administration.vue'

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
  {
    path: '/User',
    name: 'User',
    component: User
  },
  {
    path: '/Ranking',
    name: 'Ranking',
    component: Ranking
  },
  {
    path: '/Administration',
    name: 'Administration',
    component: Administration
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
