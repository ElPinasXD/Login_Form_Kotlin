package co.edu.sena.login_and_register.paginas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login_and_register.R
import co.edu.sena.login_and_register.Navigation.PostOfficeAppRouter
import co.edu.sena.login_and_register.Navigation.Screen
import co.edu.sena.login_and_register.componentes.CheckboxComponent
import co.edu.sena.login_and_register.componentes.ClickableLogintextComponent
import co.edu.sena.login_and_register.componentes.DividerTextComponent
import co.edu.sena.login_and_register.componentes.HeadingTextComponent
import co.edu.sena.login_and_register.componentes.MyTextField
import co.edu.sena.login_and_register.componentes.NormalTextComponent
import co.edu.sena.login_and_register.componentes.PasswordTextField
import co.edu.sena.login_and_register.componentes.buttonComponent


private val BlendMode.TermsandConditionsScreen: Screen
    get() {
        TODO("Not yet implemented")
    }

@Composable
fun PaginaInicioSesion() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.Hello))
            HeadingTextComponent(value = stringResource(id = R.string.create))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextField(
                labelValue = stringResource(id = R.string.user),
                icon = {
                    Icon(
                        Icons.Rounded.Person,
                        contentDescription = null
                    )
                }
            )

            MyTextField(
                labelValue = stringResource(id = R.string.user_l),
                icon = {
                    Icon(
                        Icons.Rounded.Person,
                        contentDescription = null
                    )
                }
            )

            MyTextField(
                labelValue = stringResource(id = R.string.email),
                icon = {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null
                    )
                }
            )
            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                icon = {
                    Icon(
                        Icons.Rounded.Lock,
                        contentDescription = null
                    )

                }
            )

            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected ={
                    PostOfficeAppRouter.navigateTo(Screen.TermsandConditionsScreen)
                } )
            Spacer(modifier = Modifier.height(40.dp))

            buttonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLogintextComponent(onTextSelected = {

            })
        }
    }
}


@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    PaginaInicioSesion()
}