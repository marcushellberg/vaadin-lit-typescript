import {css, customElement, html, LitElement, property} from 'lit-element';
import '@vaadin/vaadin-text-field';

@customElement("lit-template")
class LitTemplate extends LitElement {

  @property()
  name = 'Stranger';

  static styles = css`
    h1 {
      color: hotpink;
      text-transform: uppercase;
    }
  `;

  render() {
    return html`
      <h1>Greetings ${this.name}!</h1>
      
      <div>
        <vaadin-text-field 
          label="Name" 
          .value=${this.name}
          @input=${this.updateName}
          ></vaadin-text-field>
      </div>
    `;
  }

  updateName(e: {target: HTMLInputElement}) {
    this.name = e.target.value;
    this.dispatchEvent(new CustomEvent('name-changed', {bubbles: true, composed: true, detail: e.target.value}))
  }

}