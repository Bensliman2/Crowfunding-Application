import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '',
        component: LayoutComponent,
        children: [
            { path: '', redirectTo: 'dashboard', pathMatch: 'prefix' },
            { path: 'dashboard', loadChildren: () => import('./dashboard/dashboard.module').then(m => m.DashboardModule) },
            { path: 'about', loadChildren: () => import('./about/about.module').then(m => m.AboutModule) },
            { path: 'profile', loadChildren: () => import('./user/profile/profile.module').then(m => m.ProfileModule) },
            { path: 'myprojects', loadChildren: () => import('./user/user-projects/user-projects.module').then(m => m.UserProjectsModule) },
            { path: 'mydonations', loadChildren: () => import('./user/user-donate/user-donate.module').then(m => m.UserDonateModule) },
            { path: 'settings', loadChildren: () => import('./user/settings/settings.module').then(m => m.SettingsModule) },
            { path: 'createproject', loadChildren: () => import('./crud-project/create-project/create-project.module')
            .then(m => m.CreateProjectModule)},
            { path: 'editproject', loadChildren: () => import('./crud-project/editproject/editproject.module')
            .then(m => m.EditprojectModule)},
            { path: 'projectpage', loadChildren: () => import('./crud-project/project-page/project-page.module')
            .then(m => m.ProjectPageModule) },
            { path: 'allprojects', loadChildren: () => import('./projects/allprojects/projects.module').then(m => m.ProjectsModule) },
            { path: 'newest', loadChildren: () => import('./projects/newest/newest.module').then(m => m.NewestModule) },
            { path: 'donatepage', loadChildren: () => import('./donate-page/donate-page.module').then(m => m.DonatePageModule) },
            { path: 'charts', loadChildren: () => import('./charts/charts.module').then(m => m.ChartsModule) },
            { path: 'blank-page', loadChildren: () => import('./blank-page/blank-page.module').then(m => m.BlankPageModule) }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule {}
